package sunvua.com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sunvua.com.learn.pojo.User;

import java.util.Date;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public User getUser1(){
        User u=new User();
        u.setName("ljy");
        u.setAge(18);
        u.setBirthday(new Date());
        return u;
    }
}
