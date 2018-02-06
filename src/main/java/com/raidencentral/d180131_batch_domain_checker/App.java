package com.raidencentral.d180131_batch_domain_checker;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		createDomainsFromKeywords(domainData.getKeywords());
	}
	private void checkDomains(List<String> domainList){
		
	}
	private static void createDomainsFromKeywords(Set<String> keywords){
		Set<StringBuilder> resultSbList = new HashSet<StringBuilder>();
		
		List<StringBuilder> sbList = new ArrayList<StringBuilder>();
		for(String keyword:keywords){
			sbList.add(new StringBuilder(keyword));
		}
		for(int i=0;i<sbList.size();i++){
			for(int j=0;j<sbList.size();j++){
				resultSbList.add( new StringBuilder(sbList.get(i)).append(sbList.get(j)).append(".com") );
			}
		}
		System.out.println(resultSbList);
	}
}
