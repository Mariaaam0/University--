package com.university.demo.majorCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("majorCourse")
public class MajorCourseController {
    @Autowired
    MajorCourseService majorCourseService;

    @GetMapping("")
    public List<MajorCourse> getAllMajorCourse(){
        return majorCourseService.getAll();
    }

    @GetMapping("id")
    public MajorCourse getById(@PathVariable int id) {
        return majorCourseService.getById(id);
    }

    @PostMapping("")
    public MajorCourse add(@RequestBody AddMajorCourseDTO majorCourse) {
        return majorCourseService.save(majorCourse);
    }

    @PutMapping("id")
    public MajorCourse update(@RequestBody UpdateMajorCourseDTO majorCourse, @PathVariable int id) {
        return majorCourseService.update(majorCourse,id);
    }

    @DeleteMapping("id")
    public void delete(@PathVariable ("id") int id) {
        majorCourseService.delete(id);
    }
}
