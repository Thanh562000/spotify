package com.spotify.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "play_lists")
@NoArgsConstructor
@AllArgsConstructor
public class PlayLists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "play_list_name")
    private String playlistName;


    @Column(name = "favorite_order")
    private int favoriteOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;
}
