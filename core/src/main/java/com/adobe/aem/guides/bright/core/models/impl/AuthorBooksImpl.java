package com.adobe.aem.guides.bright.core.models.impl;

import com.adobe.aem.guides.bright.core.models.AuthorBooks;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.*;



@Model(adaptables = SlingHttpServletRequest.class, 
					adapters = AuthorBooks.class,
					defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorBooksImpl implements  AuthorBooks {
	private static final Logger LOG = LoggerFactory.getLogger(AuthorBooksImpl.class);
	
	
	@Inject
	Resource componentResource;
	
	@ValueMapValue
	@Default( values = "AEM")
	private String authorname;
	
	@ValueMapValue
	private List<String> books;
	
	@Override
	public String getAuthorName() { return authorname;} 
	
	@Override
	public List<String> getAuthorBooks() { 
		if(books!=null){
			return new ArrayList<String>(books);
		}else {
			return Collections.emptyList();
		}
	}
}
