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
@Table(name = "genres")
@NoArgsConstructor
@AllArgsConstructor
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "genres_name")
    private String genresName;


    @Column(name = "image", columnDefinition = "varchar(500)")
    private String image;
}
