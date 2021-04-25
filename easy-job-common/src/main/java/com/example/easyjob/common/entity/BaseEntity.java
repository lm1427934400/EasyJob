package com.example.easyjob.common.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @className: com.example.easyjob.common.entity-> BaseEntity
 * @description: 基础信息
 * @author: liming.li
 * @createDate: 2021-04-25 下午12:44
 * @todo:
 */

@Data
public class BaseEntity implements Serializable {

    /**
     * 变量id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 是否被删除
     * 1 - 删除
     * 0 - 保留
     */

    private boolean isDeleted;

    /**
     * 数据创建时间
     */
    @CreatedDate
    @Column(name = "createdTime", updatable = false, nullable = false)
    private Long createdTime;


    /**
     * 数据最后更新时间
     */
    @LastModifiedDate
    @Column(name = "updatedTime", updatable = true, nullable = false)
    private Long updatedTime;
}
