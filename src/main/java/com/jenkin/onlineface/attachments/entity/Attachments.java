package com.jenkin.onlineface.attachments.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jenkin
 * @since 2020-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("face_attachments")
public class Attachments extends Model<Attachments> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 附件编码
     */
    private String attachmentCode;

    /**
     * 附件名称
     */
    private String attachmentName;

    /**
     * 附件格式（目前只能是图片）
     */
    private String attachmentFormat;

    /**
     * 附件路径
     */
    private String attachmentPath;

    /**
     * 附件归档年
     */
    private String attachmentLocateYear;

    /**
     * 附件归档月
     */
    private String attachmentLocateMonth;

    /**
     * 附件归档日
     */
    private String attachmentLocateDay;

    /**
     * 附件类型（评论附件，题目附件）
     */
    private String attachmentType;

    /**
     * 逻辑删除字段
     */
    private String delFlag;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime creationDate;

    /**
     * 更新时间
     */
    private LocalDateTime lastUpdateDate;

    /**
     * 更新人
     */
    private String lastUpdatedBy;

    /**
     * 版本号
     */
    private Integer versionNumber;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
