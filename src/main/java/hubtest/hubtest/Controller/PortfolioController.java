package hubtest.hubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("portfolio")
    public String portfolio(Model model) {
        model.addAttribute("message", "이것은 내가 전달한 인사");
        return "portfolio";
    }
}
