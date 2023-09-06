package com.spotify.entities;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class ArtistSongId implements Serializable {

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "artists_id")
    private Artists artists;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "songs_id")
    private Songs songs;
}
