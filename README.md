# Printing All Environment Properties and Bean Names with `CommandLineRunner`

The following explanation will implement a `CommandLineRunner` that, upon application startup, will:

1. **Enumerate and print all property names and their values** from the Spring `Environment`.
2. **List and print all bean names** registered in the `ApplicationContext`.

---

## 1. Add Dependencies (if needed)

Make sure you have the Spring Boot starter on your classpath:

```xml
<!-- pom.xml -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter</artifactId>
</dependency>
```

## 2. Create the Runner Component
