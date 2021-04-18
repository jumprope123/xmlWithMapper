package shin.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shin.spring.mvc.mapper.BoardMapper;
import shin.spring.mvc.service.IndexService;
import shin.spring.mvc.vo.BoardVO;

@Controller
public class IndexController {

    @Autowired
    private IndexService service;

    @GetMapping("/index")
    @ResponseBody
    public BoardVO index(){
        return service.getList();
    }



}
