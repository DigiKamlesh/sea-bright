/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.adobe.aem.guides.bright.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import javax.annotation.PostConstruct;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class)
public class NewsModel {

	private static final Logger log = LoggerFactory.getLogger(NewsModel.class);

	@ValueMapValue(name = PROPERTY_RESOURCE_TYPE, injectionStrategy = InjectionStrategy.OPTIONAL)
	@Default(values = "No resourceType")
	protected String resourceType;

	@SlingObject
	private Resource currentResource;
	@SlingObject
	private ResourceResolver resourceResolver;

	@ValueMapValue
	protected String newsPagePath;

	private String childPages = "";

	@PostConstruct
	protected void init() {

		childPages = getChildPages(resourceResolver, newsPagePath);

	}

	private String getChildPages(ResourceResolver resourceResolver, String newsPagePath) {
		Session session = resourceResolver.adaptTo(Session.class);
		try {
			Node mainNode = session.getNode(newsPagePath);
			NodeIterator nI = mainNode.getNodes();
			while (nI.hasNext()) {
				Node currentPageNode = nI.nextNode();
				if (!currentPageNode.getPath().contains("jcr:content"))
					childPages = childPages + currentPageNode.getPath() + "\n";
			}
		} catch (RepositoryException e) {
			log.error("Exception caught ", e);
		}
		return childPages;
	}

	public String getNewsPagePath() {
		return newsPagePath;
	}

	public String getChildPages() {
		return childPages;
	}

}
