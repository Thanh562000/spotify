package com.spotify.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
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
@Table(name = "albums")
@NoArgsConstructor
@AllArgsConstructor
public class Albums {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "album_name")
    private String albumName;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "album_time_length")
    private Float albumTimeLength;

    @Column(name = "total_listen")
    private int totalListen;

    @Column(name = "image", length = 500)
    private String image;

    @Column(name = "download_permission")
    private boolean downloadPermission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genres_id")
    private Genres genres;

    @OneToMany(mappedBy = "artistAlbumId.albums", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ArtistAlbums> artistAlbums;

    @OneToMany(mappedBy = "albumSongId.albums", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AlbumSongs> albumSongs;
}
