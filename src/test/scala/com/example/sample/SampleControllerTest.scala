package com.example.sample

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import com.example.sample.web.SampleController

@RunWith(classOf[JUnitRunner])
class SampleControllerSpec extends Specification {
  
  "SampleController" should {
    "hoge returns hoge" in {
      val sut = new SampleController
      sut.hoge must equalTo("hoge")
    }

//    "employees returns employees" in {
//      val sut = new SampleController
//      sut.employees must equalTo("hoge")
//    }
  }
  
}