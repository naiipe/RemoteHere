package com.RemoteHere;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ExportFiles {

	@SuppressWarnings("unchecked")
	public static void ExportFileJson() throws IOException {

		JSONObject obj = new JSONObject();
		obj.put("Name", "remoteOK.com");
		obj.put("Author", "Rafael");

		JSONArray company = new JSONArray();
		company.add("Job1: job1");
		company.add("Job2: Job2");
		company.add("Job3: job3");
		obj.put("Company List", company);

		try (FileWriter file = new FileWriter("/Users/aluno/Documents/test.txt")) {
			file.write(obj.toJSONString());
			System.out.println("Process done.");
			System.out.println("\nJSON Object: " + obj);
		}
	}
}
