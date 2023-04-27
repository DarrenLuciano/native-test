package com.example.nativetest;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource
@Repository
@RegisterReflectionForBinding
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
