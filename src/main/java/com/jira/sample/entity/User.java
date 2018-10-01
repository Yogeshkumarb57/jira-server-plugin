package com.jira.sample.entity;

import net.java.ao.Entity;

public interface User extends Entity
{
	String getName();
	void setName(String name);
	
    String getEmail();

    void setEmail(String email);

    boolean isActive();

    void setActive(boolean active);
}
