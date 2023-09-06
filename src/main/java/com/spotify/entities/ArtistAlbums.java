package com.spotify.entities;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "artist_albums")
public class ArtistAlbums {
    @EmbeddedId
    private ArtistAlbumId artistAlbumId;
}
