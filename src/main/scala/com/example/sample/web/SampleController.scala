package com.example.sample.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod

@RestController
@RequestMapping(Array("/api/sample"))
class SampleController {
  @RequestMapping(method = Array(RequestMethod.GET))
  def data = "hoge"
}