package hubtest.hubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("handshake")
    public String handshake(Model model) {
        model.addAttribute("message", "이것은 내가 전달한 인사");
        return "hello-mvc";
    }

    @GetMapping("thisisapi")
    @ResponseBody
    public String thisisapi(@RequestParam("name") String name) {
        return "Hello " + name;
    }

}
