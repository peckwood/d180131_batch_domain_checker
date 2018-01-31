package com.raidencentral.d180131_batch_domain_checker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * skill points: input/ouput
 * 
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		// how to write unicode characters into a text file
		// String filePath = "d.txt";
		// Writer writer = new BufferedWriter(new OutputStreamWriter(new
		// FileOutputStream(new File(filePath)), StandardCharsets.UTF_8));
		// PrintWriter printWriter = new PrintWriter(writer);
		// printWriter.println("hello你好");
		// printWriter.close();
		// https://stackoverflow.com/questions/35132693/set-encoding-as-utf-8-for-a-filewriter

		//read from a file
		// String fileName = "domains.json";
		// BufferedReader bufferedReader = new BufferedReader(
		// new InputStreamReader(new FileInputStream(fileName),
		// StandardCharsets.UTF_8));
		//bufferedReader.close();

		String fileName = "domains.json";
		ObjectMapper mapper = new ObjectMapper();
		DomainData domainData = mapper.readValue(new File(fileName), DomainData.class);
		System.out.println(domainData);
	}
}
