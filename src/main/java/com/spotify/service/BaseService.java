package com.spotify.service;

/*
 * @project_name: spotify_backend
 * @package: com.spotify.service
 * @author: Admin
 * @version: v1.0
 */

public interface BaseService<T, K> {
    T save(T t);

    T update(T t);

    T findById(K id);

    boolean delete(K id);
}
