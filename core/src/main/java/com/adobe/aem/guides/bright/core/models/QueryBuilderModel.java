package com.adobe.aem.guides.bright.core.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import com.day.cq.wcm.api.Page;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class QueryBuilderModel {

	private static final Logger log = LoggerFactory.getLogger(QueryBuilderModel.class);

	@Inject
	private String queryBuilderRootPath;

	@Self
	Resource resource;

	public String getarticleRootPath() {
		return queryBuilderRootPath;

	}

	@PostConstruct
	protected void init() {
		ResourceResolver resourceResolver = resource.getResourceResolver();
		Session session = resourceResolver.adaptTo(Session.class);

		QueryBuilder builder = resourceResolver.adaptTo(QueryBuilder.class);

		Map<String, String> predicate = new HashMap<>();
		predicate.put("path", queryBuilderRootPath);
		predicate.put("type", "cq:Page");

		Query query = null;

		try {
			query = builder.createQuery(PredicateGroup.create(predicate), session);
		} catch (Exception e) {
			log.error("ERROE IN QUERY", e);
		}

		SearchResult searchResult = query.getResult();
		queryBuilderDataBean = new ArrayList<QueryBuilderDataBean>();

		for (Hit hit : searchResult.getHits())
			;
		QueryBuilderDataBean queryBuilderDataBean = new QueryBuilderDataBean();
		String path = null;

		try {
			path = Hit.getPath();
			Resource queryBuilderResource = ResourceResolver.getResource(path);
			Page queryBuilderPage = queryBuilderResource.adaptTo(Page.class);
			String title = queryBuilderPage.getTitle();
			String description = queryBuilderPage.getDescription();

			queryBuilderDataBean.setPath(path);
			queryBuilderDataBean.setTitle(title);
			queryBuilderDataBean.setDescription(description);
			log.debug("Path:{} \n Title:{} \nDescription:{}", path, title, description);
			queryBuilderDataBean.add(QueryBuilderDataBean);
		} catch (RepositoryException e) {
			throw new RuntimeException(e);
		}

	}

	public List<QueryBuilderDataBean> getQueryBuilderDataBean() {
		return queryBuilderDataBean;
	}

}
