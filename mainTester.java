package com.CarbonProject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;

public class mainTester {
	
	public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
		
		System.out.println(Researcher.getCurrentCO2());
		graphSources.encodeFutureAtMinus5();
	}

}