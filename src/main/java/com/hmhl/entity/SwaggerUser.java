package com.hmhl.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@ApiModel("用户实体类")
@Data
@Builder
public class SwaggerUser {

    @ApiModelProperty("用户Id")
    private Long id;

    @ApiModelProperty("用户名称")
    private String name;
}
