package com.hackerrank.sample.service;

import com.hackerrank.sample.model.Employee;
import com.hackerrank.sample.model.Model;
import java.util.List;

public interface ModelService {
    void deleteAllModels();
    void deleteModelById(Long id);

    void createModel(Employee employee);

    Employee getModelById(Long id);

    List<Employee> getAllModels();
}
