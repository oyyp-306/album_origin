package com.oy.album.service.impl;

import com.oy.album.dao.AlbumDao;
import com.oy.album.service.AlbumService;
import com.oy.album.vo.AlbumVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Override
    public int insertAlbum(AlbumVo albumVo){
        log.info("insertAlbum:{}", albumVo);
        return albumDao.insertAlbum(albumVo);
    };

    @Override
    public int updateAlbum(AlbumVo albumVo){
        log.info("updateAlbum:{}", albumVo);
        return albumDao.updateAlbum(albumVo);
    };

    @Override
    public int deleteAlbum(String albumCode){
        log.info("deleteAlbum:{}", albumCode);
        return albumDao.deleteAlbum(albumCode);
    };

    @Override
    public AlbumVo findAlbumByCode(String albumCode){
        log.info("findAlbumByCode:{}", albumCode);
        return albumDao.findAlbumByCode(albumCode);
    };

    @Override
    public List<AlbumVo> findAlbumByStatus(String status){
        log.info("findAlbumByStatus:{}", status);
        return albumDao.findAlbumByStatus(status);
    };
}
