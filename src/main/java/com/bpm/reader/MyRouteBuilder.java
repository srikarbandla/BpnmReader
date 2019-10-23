package com.bpm.reader;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("D:/Java/bpmsample.xml")
			.process(new LogProcessor())
			.bean(new Transormer(), "TransformContent")
			.to("file:D:/Java");
		
	}

}
