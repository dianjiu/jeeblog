package cn.org.dianjiu.common.pojo.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TBlogThemeResp) Resp
 *
 * @author makejava
 * @since 2020-09-05 21:30:25
 */
@Data
public class TBlogThemeResp implements Serializable {
    private static final long serialVersionUID = 9155949248117098529L;
    private Integer id;
    @ApiModelProperty("主题名(url)")
    private String themeName;
    @ApiModelProperty("主题描述")
    private String themeDescribe;
    @ApiModelProperty("主题预览图")
    private String themeImg;
    @ApiModelProperty("状态 1 -- 生效  0  -- 弃用")
    private String status;
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty("更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

}