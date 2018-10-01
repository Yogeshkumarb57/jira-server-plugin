package com.jira.sample.dao;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.atlassian.activeobjects.external.ActiveObjects;
import com.atlassian.plugin.spring.scanner.annotation.export.ExportAsService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.jira.sample.entity.User;

@ExportAsService ({UsersRepository.class})
@Named ("usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

	@ComponentImport
    private final ActiveObjects ao;

    @Inject
    public UsersRepositoryImpl(ActiveObjects ao)
    {
        this.ao = checkNotNull(ao);
    }

	@Override
	public List<User> findAll() {
		return Arrays.asList(ao.find(User.class));
	}

	@Override
	public User save(User user) {
		user=ao.create(User.class);
		user.setName("yogesh");
		user.setEmail("myemail");
		user.setActive(true);
		return user;
	}
}
