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

    @GetMapping("hello-string")
    @ResponseBody
    public String hello_string(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public String hello_api(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return "Hello " + name;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
