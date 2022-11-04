package com.securelogin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class myuserdetailsService implements UserDetailsService {

	@Autowired
	userRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional <user> u1= repo.findByUsername(username);
		u1.orElseThrow(()-> new UsernameNotFoundException("Not Found:"+username));
		return u1.map(myuserdetails::new).get();
	}

}
