package com.adobe.aem.guides.bright.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name ="OSGI Service Configuration of AEM", description="This is example learning")

public @interface OsgiServiceConfiguration {
    @AttributeDefinition(name= "course Name") String courseName() default "AEM -Adobe experience Manager";
    @AttributeDefinition(name= "Course content") String courseContent() default "AEM front end and Backend";
    @AttributeDefinition(name= "Course Duration") String courseDuration() default "45dayss";
}
