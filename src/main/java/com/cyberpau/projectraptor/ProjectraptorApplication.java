package com.cyberpau.projectraptor;

import com.cyberpau.projectraptor.model.Project;
import com.cyberpau.projectraptor.model.ProjectAssignment;
import com.cyberpau.projectraptor.model.UserAccount;
import com.cyberpau.projectraptor.repository.ProjectAssignmentRepository;
import com.cyberpau.projectraptor.repository.ProjectRepository;
import com.cyberpau.projectraptor.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProjectraptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectraptorApplication.class, args);
	}

}
