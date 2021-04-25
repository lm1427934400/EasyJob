package com.example.easy.job.server.entity;

import com.example.easyjob.common.entity.BaseEntity;
import com.example.easyjob.common.entity.constant.UserConstant;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @className: com.example.easy.job.server.entity-> User额
 * @description: 定义User模型
 * @author: liming.li
 * @createDate: 2021-04-25 上午12:20
 * @todo: 可以定义更多用户模型
 */

@Data
@Builder
public class User extends BaseEntity implements Serializable {

    /**
     * 用户名，全局唯一
     */
    @NotNull(message = "用户名不能为空")
    @Length(min = UserConstant.USER_MIN_LENGTH,
            max = UserConstant.USER_MAX_LENGTH,
            message = "用户名长度过长或者过短")
    private String username;

    /**
     * 密码
     */
    @NotNull(message = "密码不能为空")
    @Length(min = UserConstant.PASS_WORD_MIN_LENGTH,
            max = UserConstant.PASS_WORD_MIN_LENGTH,
            message = "密码长度过长或者过短")
    private String password;


    /**
     * 头像
     */
    private String avatar;


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ id = ").append(getId()).append(",")
                .append("username = ").append(getUsername()).append(",")
                .append("isDeleted = ").append(isDeleted()).append(",")
                .append("createdTime = ").append(getCreatedTime()).append(",")
                .append("updatedTime = ").append(getUpdatedTime()).append(" }");
        return stringBuilder.toString();
    }
}
