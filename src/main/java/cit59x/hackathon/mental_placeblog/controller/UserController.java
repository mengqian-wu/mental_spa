package cit59x.hackathon.mental_placeblog.controller;

import cit59x.hackathon.mental_placeblog.service.UserService;
import cit59x.hackathon.mental_placeblog.vo.LoginVO;
import cit59x.hackathon.mental_placeblog.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * Direct to register page.
     *
     * @return
     */
    @RequestMapping("/register")
    public String toRegisterPage() {
        //
        return null;
    }

    /**
     * Create new user with frontend inputs.
     *
     * @return
     */
    @RequestMapping("/register/process")
    public String register() {
        //
        return null;
    }

    /**
     * Direct to login page.
     *
     * @return
     */
    @RequestMapping("/login")
    public String toLoginPage() {
        return "login";
    }

    /**
     * Try to sign user in with frontend inputs.
     * If success, add user data to model for frontend use.
     *
     * @return
     */
    @RequestMapping("/login/process")
    @ResponseBody
    public RespBean login(LoginVO loginVO) {
        //for debugging
        //System.out.println("Successfully got LoginVO\nemail:" + loginVO.getEmail());
        //System.out.println("password:" + loginVO.getPassword());
        RespBean res = userService.login(loginVO);
        //System.out.println("response bean code: " + res.getCode());
        return res;
    }

}
