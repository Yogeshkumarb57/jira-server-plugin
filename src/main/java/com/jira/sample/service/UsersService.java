package com.jira.sample.service;

import java.util.List;

import com.jira.sample.entity.User;

public interface UsersService {

	List<User> findAll();

	User save(User user);
}
