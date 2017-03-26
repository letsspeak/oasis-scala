package com.example.sample.domain.entity

import javax.persistence.GeneratedValue
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Employee {

  @Id @GeneratedValue
	var id: java.lang.Long = _

	var firstName: String = _
	var lastName: String = _
	var description: String = _
	
	// for Spring Data REST
	def getId: java.lang.Long = id;
	def getFirstName: String = firstName;
	def getLastName: String = firstName;
	def getDescription: String = description;
}
