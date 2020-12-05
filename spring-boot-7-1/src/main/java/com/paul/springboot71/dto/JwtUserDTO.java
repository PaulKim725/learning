package com.paul.springboot71.dto;

import com.paul.springboot71.vo.Role;
import com.paul.springboot71.vo.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * 登录用户数据传输对象
 *
 * @author jinzhm
 * @date 2020/12/5 14:06
 */
@Data
public class JwtUserDTO implements UserDetails {

    private User user;

    private List<Role> roleList;

    private List<GrantedAuthority> authorities;

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return "1".equals(user.getEnableFlag()) ? true : false;
    }
}
