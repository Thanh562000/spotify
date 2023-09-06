package com.spotify.entities;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AlbumSongId implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "songs_id")
    private Songs songs;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "albums_id")
    private Albums albums;

}
