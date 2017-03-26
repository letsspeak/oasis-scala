package com.example.sample.domain.repository

import org.springframework.data.repository.CrudRepository

trait EmployeeRepository extends CrudRepository[com.example.sample.domain.entity.Employee, java.lang.Long] { }