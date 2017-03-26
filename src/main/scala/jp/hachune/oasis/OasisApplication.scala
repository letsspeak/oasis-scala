package jp.hachune.oasis
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.domain.EntityScan

@Configuration
@EnableAutoConfiguration
@EntityScan(Array("com.example.sample.domain.entity"))
@EnableJpaRepositories(Array("com.example.sample.domain.repository"))
@ComponentScan(Array("jp.hachune.oasis", "com.example.sample"))
class OasisApplication {
}

object OasisApplication extends App {
  SpringApplication.run(classOf[OasisApplication], args: _*)
}