package jp.hachune.oasis
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@Configuration
@EnableAutoConfiguration
@ComponentScan(Array("jp.hachune.oasis", "com.example.sample"))
class OasisApplication {
}

object OasisApplication extends App {
  SpringApplication.run(classOf[OasisApplication], args: _*)
}