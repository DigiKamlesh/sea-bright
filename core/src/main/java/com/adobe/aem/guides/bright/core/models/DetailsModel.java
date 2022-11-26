package com.adobe.aem.guides.bright.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DetailsModel {
    @ValueMapValue
    private String pageTitle;
    @ValueMapValue
    private String pageLink;
    @ChildResource
    private
    List<DetailsModel> childPages;

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public List<DetailsModel> getChildPages() {
        return childPages;
    }

    public void setChildPages(List<DetailsModel> childPages) {
        this.childPages = childPages;
    }

}

