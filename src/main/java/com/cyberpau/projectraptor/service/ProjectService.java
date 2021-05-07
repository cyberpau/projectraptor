package com.cyberpau.projectraptor.service;

import com.cyberpau.projectraptor.exception.ProjectNotFoundException;
import com.cyberpau.projectraptor.model.Project;
import com.cyberpau.projectraptor.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public Project findProjectById(Long id) {
        return projectRepository.findProjectById(id).orElseThrow(
                () -> new ProjectNotFoundException("Project by id " + id + " was not found."));
    }

    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteProjectById(id);
    }
}
