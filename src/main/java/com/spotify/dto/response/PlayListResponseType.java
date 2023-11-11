package com.spotify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayListResponseType {
    private Integer id;
    private String playListName;
    private int favoriteOrder;
    private UserResponseType users;
}
