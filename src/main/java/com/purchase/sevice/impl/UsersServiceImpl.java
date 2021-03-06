package com.purchase.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.entity.Users;
import com.purchase.entity.UsersExample;
import com.purchase.entity.UsersExample.Criteria;
import com.purchase.mapper.UsersMapper;
import com.purchase.sevice.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper userMapper;

	@Override
	public List<Users> getAllUsers() {
		return userMapper.selectAll();
	}

	@Override
	public Users getUserById(String username) {
		return userMapper.selectByPrimaryKey(username);
	}

	@Override
	public boolean insertUser(Users user) {
		try {
			userMapper.insert(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUser(Users user) {
		try {
			userMapper.updateByPrimaryKey(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		try {
			userMapper.deleteByPrimaryKey(username);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean validate(String username, String password) {
		Users user = userMapper.selectByPrimaryKey(username);
		if(user.getPassword().trim().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Users> getUserByRole(String role) {
		UsersExample example = new UsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andRolesEqualTo(role);
		return userMapper.selectByExample(example);
	}
}
