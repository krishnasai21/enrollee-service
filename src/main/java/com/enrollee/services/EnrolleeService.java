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

    public void delete(Integer id) {
        Optional<Enrollee> enrollee = enrolleeRepository.findById(id);
        if (enrollee.isPresent()) {
            enrolleeRepository.delete(enrollee.get());
        }
    }

    public Enrollee findEnrollee(Integer id) {
        return enrolleeRepository.findById(id).get();
    }

    public Enrollee updateEnrollee(Enrollee enrollee, Integer id) {
        Enrollee existing = enrolleeRepository.findById(id).get();
        return enrolleeRepository.save(existing);
    }

    public Enrollee createDependant(Dependent dependent, Integer id) {
        Optional<Enrollee> enrollee = enrolleeRepository.findById(id);
        if (enrollee.isPresent()) {
            if (enrollee.get().getDependents() != null) {
                enrollee.get().getDependents().add(dependent);
            } else {
                enrollee.get().setDependents(Arrays.asList(dependent));
            }
        }
        return enrollee.get();
    }
}
