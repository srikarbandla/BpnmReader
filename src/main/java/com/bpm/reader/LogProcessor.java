package com.bpm.reader;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class LogProcessor implements Processor{

	public void process(Exchange exchange) throws Exception {
		String payload = exchange.getIn().getBody(String.class);    
		System.out.println(">>>>>>>>>>>>"+payload);
		// do something with the payload and/or exchange here       
		exchange.getIn().setBody("By");
		
	}

}
