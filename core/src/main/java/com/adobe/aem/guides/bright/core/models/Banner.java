package com.adobe.aem.guides.bright.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.wcm.core.components.models.Image;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Banner implements Image{

	@ValueMapValue
	public String image;
	
	@ValueMapValue
	public String title;
	
	@ValueMapValue
	public String description;
	
	public String getImage() {
		return image;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}	

}
	