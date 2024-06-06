package com.hmhl.api;

import com.hmhl.entity.SwaggerUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "用户端控制器")
@RestController
@RequestMapping("/api")
public class ApiController {

    @ApiOperation(value = "获取数据")
    @GetMapping("/test")
    public List<SwaggerUser> test(
            @ApiParam(name = "id",value = "用户Id") Long id,
            @ApiParam(name = "name",value = "用户名称") String name
    ){
        List<SwaggerUser> list = new ArrayList<>();
        list.add(SwaggerUser.builder().id(id).name(name).build());
        return list;
    }


}
