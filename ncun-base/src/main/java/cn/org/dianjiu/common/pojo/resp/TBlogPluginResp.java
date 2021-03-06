package cn.org.dianjiu.common.pojo.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (TBlogPluginResp) Resp
 *
 * @author makejava
 * @since 2020-09-05 21:30:19
 */
@Data
public class TBlogPluginResp implements Serializable {
    private static final long serialVersionUID = 9155949248117098529L;
    private Integer id;
    @ApiModelProperty("插件名(url)")
    private String pluginName;
    @ApiModelProperty("插件描述")
    private String pluginDescribe;
    @ApiModelProperty("插件预览图")
    private String pluginImg;
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