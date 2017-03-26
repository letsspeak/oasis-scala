package com.example.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import com.example.sample.domain.repository.EmployeeRepository
import com.example.sample.domain.entity.Employee
import org.springframework.context.ApplicationContext
import java.util.Arrays

// @Component
class DatabaseLoader extends CommandLineRunner {

  @Autowired
	var repository:EmployeeRepository = _

  @Autowired
  var applicationContext:ApplicationContext = _

	@Override
	@throws(classOf[Exception])
	def run(strings:String*) : Unit = {
		// repository.save(new Employee("Frodo", "Baggins", "ring bearer"))
  }
}