package jp.hachune.oasis

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod

@RestController
@RequestMapping(Array("/api/hoge"))
class HogeController {
  @RequestMapping(method = Array(RequestMethod.GET))
  def data = "hoge"
}