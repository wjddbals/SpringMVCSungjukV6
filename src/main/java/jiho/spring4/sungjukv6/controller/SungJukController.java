package jiho.spring4.sungjukv6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jiho.spring4.sungjukv6.service.SungJukV6Service;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SungJukController {

    private SungJukV6Service sjsrv;

    @Autowired
    public SungJukController(SungJukV6Service sjsrv) {
        this.sjsrv = sjsrv;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        System.out.println(sjsrv.readSungJuk());

       //sungjuklist.jsp에 성적조회결과를 sjs라는 이름으로 넘김
        model.addAttribute("sjs",sjsrv.readSungJuk());

        return "sungjuklist";
    }

}
