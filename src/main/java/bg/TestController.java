package bg;

import bg.bean.User;
import bg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Auther: Chujian
 * @Date: 2022/10/5
 */
@RestController
@RequestMapping("/test")
public class TestController{

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/sss")
    public List<User> test(){
        return userMapper.selectList(null);
    }
}
