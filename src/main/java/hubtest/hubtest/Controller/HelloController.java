package hubtest.hubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("handshake")
    public String handshake(Model model) {
        model.addAttribute("message", "이것은 내가 전달한 인사");
        return "hello-mvc";
    }
}
