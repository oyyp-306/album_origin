package com.oy.album.controller;

import com.oy.album.service.AlbumService;
import com.oy.album.vo.AlbumVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping("/add")
    public int insertAlbum(@RequestBody AlbumVo albumVo) {
        log.info("insertAlbum");
        return albumService.insertAlbum(albumVo);
    }

    @PutMapping("/update")
    public int updateAlbum(@RequestBody AlbumVo albumVo) {
        log.info("updateAlbum");
        return albumService.updateAlbum(albumVo);
    }

    @DeleteMapping("/delete")
    public int deleteAlbum(@RequestParam String albumCode) {
        log.info("deleteAlbum");
        return albumService.deleteAlbum(albumCode);
    }

    @GetMapping("/findAlbumByCode")
    public AlbumVo findAlbumByCode(@RequestParam String albumCode) {
        log.info("findAlbumByCode");
        return albumService.findAlbumByCode(albumCode);
    }

    @GetMapping("/findAlbumByStatus")
    public List<AlbumVo> findAlbumByStatus(@RequestParam String status) {
        log.info("findAlbumByStatus");
        return albumService.findAlbumByStatus(status);
    }
}
