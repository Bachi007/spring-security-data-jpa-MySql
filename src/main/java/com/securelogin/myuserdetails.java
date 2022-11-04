package com.securelogin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class myuserdetails implements UserDetails{

	private String uName;
	private String uPassword;
	private boolean uActive;
	private List<GrantedAuthority> authorities;
	public myuserdetails(user u1) {
		this.uName=u1.getUsername();
		this.uPassword=u1.getUPassword();
		this.uActive=u1.isuActive();
		this.authorities=Arrays.stream(u1.getURole().split(","))
				.map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}
	public myuserdetails() {
		
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return uPassword;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return uName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return uActive;
	}

}
