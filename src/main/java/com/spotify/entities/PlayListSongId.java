package com.spotify.entities;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.entities
 * @author: Admin
 * @version: v1.0
 */

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class PlayListSongId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "songs_id")
    private Songs songs;

    @ManyToOne
    @JoinColumn(name = "play_list_id")
    private PlayLists playLists;
}
