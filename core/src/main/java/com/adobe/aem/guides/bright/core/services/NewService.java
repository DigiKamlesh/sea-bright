package com.adobe.aem.guides.bright.core.services;


import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

public interface NewService {
	 default String prepareResponse(Session session, String path, String property) throws PathNotFoundException, RepositoryException {
		return null;

	 }
}
