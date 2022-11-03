package com.adobe.aem.guides.bright.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL )
public class Cards {

	@ValueMapValue
	public String cardsImage;
	
	@ValueMapValue
	public String cardsTitle;
	
	@ValueMapValue
	public String cardsDesc;
	
	public String getCardsImage() {
		return cardsImage;
	}

	public String getCardsTitle() {
		return cardsTitle;
	}

	public String getCardsDesc() {
		return cardsDesc;
	}
}
