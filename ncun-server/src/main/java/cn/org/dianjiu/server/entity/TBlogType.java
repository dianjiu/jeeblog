package cn.org.dianjiu.server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * (TBlogType)实体类
 *
 * @author makejava
 * @since 2020-09-05 21:30:25
 */
@Data
public class TBlogType {
    /**
     * 唯一ID
     */
    private Integer id;
    /**
     * 标签名称
     */
    private String labelName;
    /**
     * 分类路径
     */
    private String typeUrl;
    /**
     * 描述
     */
    private String typeDescribe;
    /**
     * 0  -- 类型  1 -- 分类   2 -- 标签   3 -- 专题
     */
    private String type;
    /**
     * 0  -- 未读  1 -- 已用
     */
    private String status;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}