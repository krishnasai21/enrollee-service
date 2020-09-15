package com.enrollee.services;

import com.enrollee.model.Dependent;
import com.enrollee.model.Enrollee;
import com.enrollee.repository.EnrolleeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

@Service
public class EnrolleeService {

    @Autowired
    EnrolleeRepository enrolleeRepository;

    public Enrollee save(Enrollee enrollee) {
        return enrolleeRepository.save(enrollee);

    }

    public void delete(String id) {
        Optional<Enrollee> enrollee = enrolleeRepository.findById(id);
        enrollee.ifPresent(value -> enrolleeRepository.delete(value));
    }

    public Enrollee findEnrollee(String id) {
        return enrolleeRepository.findById(id).get();
    }

    public Enrollee updateEnrollee(Enrollee enrollee, String id) {
        Enrollee existing = enrolleeRepository.findById(id).get();
        return enrolleeRepository.save(existing);
    }

    public Enrollee createDependant(Dependent dependent, String id) {
        Optional<Enrollee> enrollee = enrolleeRepository.findById(id);
        if (enrollee.isPresent()) {
            if (enrollee.get().getDependents() != null) {
                dependent.setId(enrollee.get().getId()+""+enrollee.get().getDependents().size());
                enrollee.get().getDependents().add(dependent);
            } else {
                dependent.setId(enrollee.get().getId()+"1");
                enrollee.get().setDependents(Arrays.asList(dependent));
            }
        }
        return enrolleeRepository.save(enrollee.get());
    }

    public Enrollee updateDependant(Dependent dependent, String id) {
        Optional<Enrollee> enrollee = enrolleeRepository.findById(id);
        if (enrollee.isPresent()) {
            if (enrollee.get().getDependents() != null) {
                enrollee.get().getDependents().stream().map(d -> {
                    if(d.getId().equals(dependent.getId())) {
                        return dependent;
                    }else {return d;
                    }
                });
            }
        }
        return enrolleeRepository.save(enrollee.get());
    }

}
