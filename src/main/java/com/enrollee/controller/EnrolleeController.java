package com.enrollee.controller;

import com.enrollee.model.Dependent;
import com.enrollee.model.Enrollee;
import com.enrollee.services.EnrolleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnrolleeController {

    @Autowired
    EnrolleeService enrolleeService;

    @GetMapping(path = "/enrollee/{id}")
    public Enrollee getEnrollee(@PathVariable(value = "id") Integer id) {
        return enrolleeService.findEnrollee(id);
    }

    @PostMapping(path = "/enrollee")
    public ResponseEntity<Enrollee> createEnrollee(@RequestBody Enrollee enrollee) {
        Enrollee enrollee1 = enrolleeService.save(enrollee);
        return ResponseEntity.ok().body(enrollee1);
    }

    @DeleteMapping(path = "/enrollee/{id}")
    public ResponseEntity deleteEnrollee(@PathVariable(value = "id") Integer id) {
        enrolleeService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping(path = "/update/{id}")
    public ResponseEntity<Enrollee> updateEnrollee(@RequestBody Enrollee enrollee, @PathVariable(value = "id") Integer id) {
        Enrollee enrollee1 = enrolleeService.updateEnrollee(enrollee, id);
        return ResponseEntity.ok().body(enrollee1);
    }

    @PostMapping(path = "/dependents/{id}")
    public ResponseEntity<Enrollee> createDependants(@RequestBody Dependent dependent, @PathVariable(value = "id") Integer enrolleeId) {
        Enrollee enrollee1 = enrolleeService.createDependant(dependent, enrolleeId);
        return ResponseEntity.ok().body(enrollee1);
    }


}
