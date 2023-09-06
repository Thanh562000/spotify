package com.spotify.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "album_songs")
@NoArgsConstructor
@AllArgsConstructor
public class AlbumSongs {
    @EmbeddedId
    private AlbumSongId albumSongId;
}
