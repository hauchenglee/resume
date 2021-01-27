package com.doubai.resume.service;

import com.doubai.resume.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String user_account) throws UsernameNotFoundException {
        // TODO: change exception log
        User user = userService.findByUser_account(user_account)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + user_account));

//        {
//            user = new User();
//            user.setUser_id("id");
//            user.setUser_password("$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6"); // password
//            user.setUser_email("email");
//            user.setUser_name("name");
//        }

        return UserDetailsImpl.build(user);
    }
}
