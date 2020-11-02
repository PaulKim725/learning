package com.paul.springboot2.web;

import com.paul.springboot2.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    static Map<Long, User> userListMap = Collections.synchronizedMap(new HashMap<>());

    @GetMapping("/")
    @ApiOperation(value = "获取用户信息列表")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>(userListMap.values());
        return userList;
    }

    @PostMapping("/")
    @ApiOperation(value = "创建用户信息", notes = "根据User对象创建用户")
    public String saveUser(@RequestBody User user) {
        userListMap.put(user.getId(), user);
        return "success";
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取用户信息", notes = "根据用户主键获取用户信息")
    public User getUser(@PathVariable Long id) {
        return userListMap.get(id);
    }

    @PutMapping("/{id}")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1"),
            @ApiImplicitParam(paramType = "body", dataType = "User", name = "user", value = "用户信息对象", required = true, example = "{name: 'Paul', age: 10}")
    })    @ApiOperation(value = "更新用户信息", notes = "根据url中传入的用户主键及User对象更新用户信息数据")
    public String updUser(@PathVariable Long id, @RequestBody User user) {
        User updUser = userListMap.get(id);
        updUser.setName(user.getName());
        updUser.setAge(user.getAge());
        userListMap.put(id, updUser);
        return "success";
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户", notes = "根据用户主键删除用户信息")
    public String deleteUser(@PathVariable Long id) {
        userListMap.remove(id);
        return "success";
    }

}
