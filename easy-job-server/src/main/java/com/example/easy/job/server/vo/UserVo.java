package com.example.easy.job.server.vo;

import com.example.easy.job.server.entity.User;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @className: com.example.easy.job.server.vo-> UserVo
 * @description: User接口层面的模型
 * @author: liming.li
 * @createDate: 2021-04-25 下午9:09
 * @todo:
 */

@Data
@Builder
public class UserVo extends User implements Serializable {
    /**
     * 重复密码
     */
    private String passwordRepeat;
}
