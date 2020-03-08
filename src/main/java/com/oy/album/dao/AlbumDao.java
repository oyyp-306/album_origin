package com.oy.album.dao;

import com.oy.album.vo.AlbumVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "albumDao")
public interface AlbumDao {

    int insertAlbum(AlbumVo albumVo);

    int updateAlbum(AlbumVo albumVo);

    int deleteAlbum(String albumCode);

    AlbumVo findAlbumByCode(String albumCode);

    List<AlbumVo> findAlbumByStatus(String status);
}
