package in.b2.tech.B2tech.dao;

import java.util.List;

import in.b2.tech.B2tech.model.Employee;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}