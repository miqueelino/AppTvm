package br.com.mique.AppTvm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mique.AppTvm.service.ConsumeApi;

@SpringBootApplication
public class AppTvmApplication implements CommandLineRunner {


		private final ConsumeApi api;

		public AppTvmApplication(ConsumeApi api) {
			this.api = api;
		}

		public static void main(String[] args) {
			SpringApplication.run(AppTvmApplication.class, args);
		}

		@Override
		public void run(String... args) {

			try {
				String json = api.getDados("https://jsonplaceholder.typicode.com/posts/1");
				System.out.println(json);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



