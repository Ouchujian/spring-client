package bg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: Chujian
 * @Date: 2022/10/5
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/sss")
    public String test(){
        return "ggg 思密达";
    }

}
