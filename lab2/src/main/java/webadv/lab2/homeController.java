package webadv.lab2;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class homeController {
	// inject via application.properties
    @Value("${welcome.message}")
    private String message;
    private List<String> tasks = Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");
    @GetMapping("/")
 	public String index(Model model) {
 		return "index";		
 	}
    @GetMapping("/login")
    public String login(Model model) {
    	//model.addAttribute("message", message);
        //model.addAttribute("tasks", tasks);
		//return "welcome";
    	return "plain_page";
	}
    @PostMapping("add1")
    public String doAdd(int a,int b,Model model) {
    	model.addAttribute("a",a);
    	model.addAttribute("b",b);
    	model.addAttribute("result",a+b);
    	return index(model);
    }
    @RequestMapping(value="/ajax",produces={"text/html;charset=UTF-8;"})
    @ResponseBody 
    public String ajax() {
    	return "AjaxÊµÀý£ºThis is an Ajax example";
    }
    @GetMapping("/test")
    public String test() {
    	return "ajax";
    }
}



