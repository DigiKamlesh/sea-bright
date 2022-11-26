package com.adobe.aem.guides.bright.core.servlets;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.servlet.Servlet;

import com.adobe.aem.guides.bright.core.services.NewService;
import com.day.cq.replication.PathNotFoundException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;

/**
 * This is a sample servlet which runs using the path
 */
@Component(service = Servlet.class, property = {
		Constants.SERVICE_DESCRIPTION + "=Sample Servlet which runs using the path ",
		"sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/sampleservlet" })
public class NewServiceServelt extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 4438376868274173005L;

	private static final Logger log = LoggerFactory.getLogger(NewServiceServelt.class);

	@Reference
	NewService newService;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {
		try {
			String property = request.getParameter("prop");
			String path = request.getParameter("path");
			log.debug("param 1 is : " + property);
			log.debug("param 2 is : " + path);
			ResourceResolver resolver = request.getResourceResolver();
			Session session = resolver.adaptTo(Session.class);

			String propVal = null;
			try {
				propVal = newService.prepareResponse(session, path, property);
			} catch (Exception e) {

				e.printStackTrace();
			}

			if (propVal != null) {
				response.getWriter().println("Value for the property " + property + " is  , " + propVal);
			} else {
				response.getWriter().println("There is no property with the name , " + property);
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
