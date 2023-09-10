package com.spotify.repository;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.repository
 * @author: Admin
 * @version: v1.0
 */

import com.spotify.entities.Artists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artists,Integer> {
}
