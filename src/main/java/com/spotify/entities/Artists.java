package com.spotify.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "artists")
@NoArgsConstructor
@AllArgsConstructor
public class Artists {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "birth_day")
    private LocalDate birthDay;

    @Column(name = "description")
    private String description;

    @Column(name = "country_active")
    private String countryActive;

    @Column(name = "image", length = 500)
    private String image;

    @OneToMany(mappedBy = "artistSongId.artists")
    private List<ArtistSongs> artistSongs;


    @OneToMany(mappedBy = "artistAlbumId.artists")
    private List<ArtistAlbums> artistAlbums;
}
