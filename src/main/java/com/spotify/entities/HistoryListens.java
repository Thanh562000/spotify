package com.spotify.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "history_listens")
@NoArgsConstructor
@AllArgsConstructor
public class HistoryListens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="users_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "songs-id")
    private Songs songs;

    @Column(name = "count_listens")
    private  int countListen;

    @Column(name = "date")
    private LocalDate date;


}
