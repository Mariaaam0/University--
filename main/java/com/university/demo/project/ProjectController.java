package com.university.demo.project;
import com.university.demo.student.AddStudentDTO;
import com.university.demo.student.Student;
import com.university.demo.student.UpdateStudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired ProjectService projectService;

    @GetMapping("")
    public List<Project> getAllProjects(){
        return projectService.getAll();
    }

    @GetMapping("id")
    public Project getById(@PathVariable int id){
        return projectService.getById(id);
    }
    @PostMapping("")
    public Project add(@RequestBody AddProjectDTO project) {
        return projectService.save(project);
    }

    @PutMapping("id")
    public Project update(@RequestBody UpdateProjectDTO project, @PathVariable int id) {
        return projectService.update(project,id);
    }

    @DeleteMapping("id")
    public void delete(@PathVariable ("id") int id){
        projectService.delete(id);
    }
}
