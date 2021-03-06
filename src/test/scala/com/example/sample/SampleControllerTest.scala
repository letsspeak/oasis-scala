package com.example.sample

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import com.example.sample.web.SampleController

@RunWith(classOf[JUnitRunner])
class SampleControllerTest extends Specification {
  "Scalaでテスト書けるかのテスト" should {
    "RESTの返答が固定値に成る、たったそれだけな世界一簡単なテスト" in {
      val sut = new SampleController
      sut.data must equalTo("hoge")
    }
  }
}