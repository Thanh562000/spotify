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
@Table(name = "songs")
@NoArgsConstructor
@AllArgsConstructor
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "time_play")
    private String timePlay;

    @Column(name = "download_permission")
    private boolean downloadPermission;

    @Column(name = "media_url")
    private String mediaUrl;

    @Column(name = "lyrics", columnDefinition = "text")
    private String lyrics;

    @Column(name = "image")
    private String image;

    @Column(name = "description")
    private String description;

    @Column(name = "count_listen")
    private long countListen;
}
