package cit59x.hackathon.mental_placeblog.service;

import cit59x.hackathon.mental_placeblog.entity.User;
import cit59x.hackathon.mental_placeblog.repo.UserRepository;
import cit59x.hackathon.mental_placeblog.vo.LoginVO;
import cit59x.hackathon.mental_placeblog.vo.RespBean;
import cit59x.hackathon.mental_placeblog.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Register and return user if success.
     *
     * @return
     */
    public User register() {
        //TODO
        return null;
    }

    /**
     * Login and return user if success.
     *
     * @return
     */
    public RespBean login(LoginVO loginVO) {
        String email = loginVO.getEmail();
        String password = loginVO.getPassword();
        //get user
        User user = getUserByEmail(email);
        //if not found, error: user does not exist
        if (user == null) return RespBean.error(RespBeanEnum.USER_NOT_EXIST);
        //if password different, error: wrong password
        if (!password.equals(user.getPassword())) return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        //else, success
        //System.out.println("Successfully signed in!");
        return RespBean.success(0);
    }

    /**
     * Get user by Email.
     *
     * @return
     */
    public User getUserByEmail(String email) {
        return userRepository.findById(email).get();
    }
}
