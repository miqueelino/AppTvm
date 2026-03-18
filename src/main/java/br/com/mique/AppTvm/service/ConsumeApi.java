package br.com.mique.AppTvm.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumeApi {
	
	
	public String getDados(String endereco) {

	    HttpClient client = HttpClient.newHttpClient();

	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(endereco))
	            .build();

	    try {
	        HttpResponse<String> response =
	                client.send(request, HttpResponse.BodyHandlers.ofString());

	        System.out.println("Status: " + response.statusCode());

	        return response.body();

	    } catch (IOException | InterruptedException e) {
	        System.out.println("Erro ao consumir API: " + e.getMessage());
	        return null;
	    }
	}
}
