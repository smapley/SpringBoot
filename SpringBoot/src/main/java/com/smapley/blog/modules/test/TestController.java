package com.smapley.blog.modules.test;

import com.smapley.blog.base.exception.RestException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 通过@ApiOperation注解来给API增加说明、
 * 通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。
 *
 * @author EricNts
 * @date 2018/4/22
 */
@RestController
public class TestController {

    @ApiOperation(value = "测试", notes = "基础测试")
    @ApiImplicitParam(name = "test", value = "用户", required = true, dataType = "Test")
    @PostMapping("test")
    public String test(@RequestBody Test test) {
        return "name=" + test.getName()+", age="+ test.getAge();
    }


    @GetMapping("exception")
    public String exception() throws RestException {
        throw new RestException("接口访问异常");
    }
}
