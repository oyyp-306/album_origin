package com.oy.album.service;

import com.oy.album.vo.AlbumVo;

import java.util.List;

public interface AlbumService {

    int insertAlbum(AlbumVo albumVo);

    int updateAlbum(AlbumVo albumVo);

    int deleteAlbum(String albumCode);

    AlbumVo findAlbumByCode(String albumCode);

    List<AlbumVo> findAlbumByStatus(String status);
}
