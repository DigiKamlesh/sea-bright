package com.adobe.aem.guides.bright.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.ServletResolverConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

@Component(service = Servlet.class,
properties = { ServletResolverConstants.SLING_SERVLET_NAME + "=" + "Demo Default Resource Servelet ",
			   ServletResolverConstants.SLING_SERVLET_METHODS + "=" + HttpConstants.METHOD_GET,
			   ServletResolverConstants.SLING_SERVLET_RESOURCE_TYPES + "=" + "sling/servlet/default",
			   ServletResolverConstants.SLING_SERVLET_SELECTORS + "=" + "default",
			   ServletResolverConstants.SLING_SERVLET_EXTENSIONS + "=" + "html"})
@ServiceDescription("DemoDefaultResourceServelet")
public class DemoDefaultResourceServelet extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
		throws ServletException, IOException{
			resp.getWriter().println("Inside DemoDefaultResourceServelet");
		}
}
