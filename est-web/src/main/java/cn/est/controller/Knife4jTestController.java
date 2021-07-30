package cn.est.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kokowaah3
 * @date 2021/7/29
 */
@Api(tags = "测试模块")
@RestController
public class Knife4jTestController {

    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "Knife4j测试")
    @GetMapping("/sayHi")
    public ResponseEntity<String> sayHi(@RequestParam(value = "name")String name){
        return ResponseEntity.ok("Hi:"+name);
    }
}

