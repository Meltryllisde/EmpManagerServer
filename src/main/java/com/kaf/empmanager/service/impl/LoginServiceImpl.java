package com.kaf.empmanager.service.impl;

import com.kaf.empmanager.mapper.LoginMapper;
import com.kaf.empmanager.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public boolean login(String number, String password) {
        return loginMapper.login(number, password) != null;
    }
}
