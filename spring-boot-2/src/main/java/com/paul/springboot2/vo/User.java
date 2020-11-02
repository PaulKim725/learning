package com.paul.springboot2.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户信息对象")
public class User {

    @ApiModelProperty("用户主键")
    private Long id;

    @ApiModelProperty("用户账号")
    private String userName;

    @ApiModelProperty("用户密码")
    private String passWord;

    @ApiModelProperty("用户名称")
    private String name;

    @ApiModelProperty("用户年龄")
    private Integer age;
}
