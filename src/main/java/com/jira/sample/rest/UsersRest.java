package com.jira.sample.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.atlassian.gadgets.GadgetRequestContext.User;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.jira.sample.service.UsersService;

@Path("/users")
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public class UsersRest {
	
	@Inject
	private UsersService usersService;
	
	@GET
	@Path("/")
	public Response getUsers() {
		return Response.ok(usersService.findAll()).build();
	}
}