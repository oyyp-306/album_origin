package com.oy.album.vo;


import lombok.Data;

import java.sql.Timestamp;


@Data
public class AlbumVo {

    /** id */
    private Integer id;

    /** 画册code */
    private String albumCode;

    /** 画册名称*/
    private String albumName;

    /** 创建人*/
    private String createBy;

    /** 创建时间*/
    private Timestamp createDate;

    /** 状态*/
    private String status;
}
