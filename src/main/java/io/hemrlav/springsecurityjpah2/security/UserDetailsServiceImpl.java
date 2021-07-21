package io.hemrlav.springsecurityjpah2.security;

import io.hemrlav.springsecurityjpah2.entity.User;
import io.hemrlav.springsecurityjpah2.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userDetailsRepository
                .findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Could not find User : " + username));
        return new UserDetailsImpl(user);
    }
}
