package com.example.sample.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod
import com.example.sample.domain.entity.Employee
import com.example.sample.domain.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping(Array("/sample"))
class SampleController {

  @Autowired
  var repository: EmployeeRepository = _

  @RequestMapping(value = Array("/hoge"), method = Array(RequestMethod.GET))
  def hoge = "hoge"

  @RequestMapping(value = Array("/employees"), method = Array(RequestMethod.GET))
  def employees : java.lang.Iterable[Employee] = {
    return repository.findAll()
  }

}