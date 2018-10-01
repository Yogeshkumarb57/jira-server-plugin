package com.jira.sample.dao;

import java.util.List;

import com.jira.sample.entity.User;

public interface UsersRepository {
	List<User> findAll();

	User save(User user);
}
