package com.jira.sample.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.jira.sample.dao.UsersRepository;
import com.jira.sample.entity.User;

@ExportAsService({ UsersService.class })
@Named("usersService")
public class UsersServiceImpl implements UsersService {

	@ComponentImport
	private final UsersRepository usersRepository;

	@Inject
	public UsersServiceImpl(final UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public List<User> findAll() {
		return usersRepository.findAll();
	}

	@Override
	public User save(User user) {
		return usersRepository.save(user);
	}

}
