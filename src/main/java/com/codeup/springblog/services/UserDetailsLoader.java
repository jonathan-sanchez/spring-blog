package com.codeup.springblog.services;

import com.codeup.springblog.DAOs.UserRepository;
import com.codeup.springblog.models.User;
import com.codeup.springblog.models.UserWithRoles;

public class UserDetailsLoader implements UserDetailsService {
    rivate final UserRepository users;

    public UserDetailsLoader(UserRepository users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        return new UserWithRoles(user);
    }
}
