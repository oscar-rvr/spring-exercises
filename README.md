# Reading Various Date and Time Formats with `@ConfigurationProperties`

Spring Boot’s **`@ConfigurationProperties`** makes it easy to bind externalized configuration into strongly‑typed Java beans. By combining it with **JSR‑310** types (e.g. `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `ZonedDateTime`) and the **`@DateTimeFormat`** annotation, you can handle a variety of date/time formats.

---

## 1. Define Your Properties

In **`src/main/resources/application.properties`** (or YAML), declare properties using different formats:

```properties
# ISO date
app.schedule.start-date=2025-04-01

# ISO time
app.schedule.start-time=14:30:00

# Custom date‑time (slash + space)
app.schedule.deadline=2025/04/30 18:00

# Instant in UTC
app.schedule.instant=2025-04-01T14:30:00Z

# Zoned date‑time with offset
app.schedule.zoned=2025-04-01 14:30:00+0200
```

## 2. Use the properties in a`@ConfigurationProperties` Class
You need to annotate the class as a Spring managed bean and then 
using the @ConfigurationProperties annotation, you can specify the prefix on your properties file

And then using the getters you can obtain the values holded in the properties file.

## 3. Consume the properties
In a service, inject the @ConfigurationProperties class, so you can use the values.

## 4. Result
<img width="298" alt="Screenshot 2025-04-10 at 12 39 08 p m" src="https://github.com/user-attachments/assets/a95215e3-401f-49b8-8219-a53886365a81" />
