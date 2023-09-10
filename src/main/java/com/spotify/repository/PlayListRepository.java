package com.spotify.repository;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.repository
 * @author: Admin
 * @version: v1.0
 */


import com.spotify.entities.PlayLists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository extends JpaRepository<PlayLists, Integer> {
}
