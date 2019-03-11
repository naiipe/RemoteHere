package com.RemoteHere;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ExportFiles {

	@SuppressWarnings("unchecked")
	public static void ExportFileJson() throws IOException {

		JSONObject obj = new JSONObject();
		obj.put("Name", "crunchify.com");
		obj.put("Author", "App Shah");

		JSONArray company = new JSONArray();
		company.add("Compnay: eBay");
		company.add("Compnay: Paypal");
		company.add("Compnay: Google");
		obj.put("Company List", company);

		// try-with-resources statement based on post comment below :)
		try (FileWriter file = new FileWriter("/Users/aluno/Documents/test.txt")) {
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
	}
}
