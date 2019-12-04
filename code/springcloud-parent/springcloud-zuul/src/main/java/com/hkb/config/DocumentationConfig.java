package com.hkb.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider{
	
	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
		resources.add(swaggerResource("app-member", "/app-member/v2/api-docs", "1.0"));
		resources.add(swaggerResource("app-order", "/app-order/v2/api-docs", "1.0"));
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}
}
