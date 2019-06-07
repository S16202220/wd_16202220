package webadv.lab2;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    List<String> tasks =Arrays.asList("我这篇文章的写作目的，就是想在符合架构原理的前提下，理解和评估以网络为基础的应用软件的架构设计，"
    		+ "得到一个功能强、性能好、适宜通信的架构。REST指的是一组架构约束条件和原则。"
    		,"REST的名称\"表现层状态转化\"中，省略了主语。\"表现层\"其实指的是\"资源\"（Resources）的\"表现层\"。","RESTful架构，就是目前最流行的一种互联网软件架构。它结构清晰、符合标准、易于理解、扩展方便，所以正得到越来越多网站的采用。",
    		"ielding是一个非常重要的人，他是HTTP协议（1.0版和1.1版）的主要设计者、Apache服务器软件的作者之一、Apache基金会的第一任主席。",
    		"Fielding将他对互联网软件的架构原则，定名为REST，即Representational State Transfer的缩写。我对这个词组的翻译是\"表现层状态转化\"",
    		"如果一个架构符合REST原则，就称它为RESTful架构。"+"Jquery是一个简洁的Javascript框架，是继Prototype之后又一个优秀的JavaScript代码库（或JavaScript框架），Jquery的宗旨是“write Less, DO More”,即倡导写更少的代码，做更多的事情");
	@GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }

}

