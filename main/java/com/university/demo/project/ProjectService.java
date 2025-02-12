package com.university.demo.project;

import com.university.demo.student.AddStudentDTO;
import com.university.demo.student.Student;
import com.university.demo.student.StudentRepository;
import com.university.demo.student.UpdateStudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  ProjectService {
    ProjectRepository projectRepository;

    public List<Project> getAll(){
        return projectRepository.findAll();
    }

    public Project getById(int id) {
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }
    public Project save(AddProjectDTO addProjectDTO) {
        Project project = new Project();
        project.setName(addProjectDTO.getName());
        project.setCourseId(addProjectDTO.getCourseId());
        return projectRepository.save(project);
    }

    public Project update(UpdateProjectDTO updateProjectDTO, Integer id) {
        Project project = getById(id);
        project.setName(updateProjectDTO.getName());
        project.setCourseId(updateProjectDTO.getCourseId());
        return projectRepository.save(project);
    }

    public void delete(int id) {
        projectRepository.deleteById(id);
    }
}
