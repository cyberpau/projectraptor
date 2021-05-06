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

	@RestController
	@RequestMapping("/projects")
	public class ProjectController {
		@Autowired
		private ProjectRepository projectRepository;

		public ProjectController(ProjectRepository projectRepository) {
			this.projectRepository = projectRepository;
		}

		@GetMapping
		public Iterable<Project> getProjects() {
			return projectRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/users")
	public class UserAccountController {
		@Autowired
		private UserAccountRepository userAccountRepository;

		public UserAccountController(UserAccountRepository userAccountRepository) {
			this.userAccountRepository = userAccountRepository;
		}

		@GetMapping
		public  Iterable<UserAccount> getUserAccounts() { return userAccountRepository.findAll(); }
	}

	@RestController
	@RequestMapping("/assignments")
	public class ProjectAssignmentController {
		@Autowired
		private ProjectAssignmentRepository projectAssignmentRepository;

		public ProjectAssignmentController(ProjectAssignmentRepository projectAssignmentRepository) {
			this.projectAssignmentRepository = projectAssignmentRepository;
		}

		@GetMapping
		public Iterable<ProjectAssignment> getProjectAssignments() {
			return projectAssignmentRepository.findAll();
		}
	}
}
