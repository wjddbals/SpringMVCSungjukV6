package jiho.spring4.sungjukv6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jiho.spring4.sungjukv6.service.SungJukV6Service;

@Controller
public class SungJukController {

    private SungJukV6Service sjsrv;

    @Autowired
    public SungJukController(SungJukV6Service sjsrv) {
        this.sjsrv = sjsrv;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        System.out.println(sjsrv.readSungJuk());

        return "sungjuklist";
    }

}
