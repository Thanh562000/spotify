package com.spotify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SongResponseType {
    private Integer id;
    private String title;
    private String timePlay;
    private Boolean downloadPermission;
    private String mediaUrl;
    private String lyrics;
    private String description;
    private String image;
    private long countListen;
    private GenresResponseType genres;
    private List<ArtistSongResponseType> artistSongs;
    private List<HistoryListenResponseType> historyListens;
    private List<AlbumSongResponseType> albumSongs;

}
