package com.mycompany.myapp;

import com.mycompany.myapp.RedisTestContainerExtension;
import com.mycompany.myapp.TestApplicationApp;
import com.mycompany.myapp.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = TestApplicationApp.class)
@ExtendWith(RedisTestContainerExtension.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
