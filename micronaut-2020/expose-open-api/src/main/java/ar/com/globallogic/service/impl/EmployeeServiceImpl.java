package ar.com.globallogic.service.impl;

import javax.inject.Singleton;

import ar.com.globallogic.dto.EmployeeDTO;
import ar.com.globallogic.service.EmployeeService;

@Singleton
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmployeeDTO getEmployee(String id) {
        EmployeeDTO employee = new EmployeeDTO(id,"a",1);
        return employee;
    }

}