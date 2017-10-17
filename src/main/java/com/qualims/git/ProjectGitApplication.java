package com.qualims.git;

import com.qualims.git.domaine.Personne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectGitApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectGitApplication.class, args);
		System.out.println("Projet git");

		Personne p = new Personne("DUPOND","Jean");
		System.out.println(p);
	}
}
