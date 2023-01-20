package com.example.logging;

import java.util.Arrays;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class LogstashGelfLoggingExampleApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(LogstashGelfLoggingExampleApplication.class);

  private final Environment environment;

  public LogstashGelfLoggingExampleApplication(Environment environment) {
    this.environment = environment;
  }

  public static void main(String[] args) {
    SpringApplication.run(LogstashGelfLoggingExampleApplication.class, args);
  }

  @Scheduled(initialDelay = 5000L, fixedDelay = 3000L)
  public void log() {
    LOGGER.info("Active profile(s): " + Arrays.toString(environment.getActiveProfiles()));
    LOGGER.info("UUID " + UUID.randomUUID());
  }
}
