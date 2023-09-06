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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "play_list_songs")
public class PlayListSongs {
    @EmbeddedId
    private PlayListSongId playListSongId;
}
