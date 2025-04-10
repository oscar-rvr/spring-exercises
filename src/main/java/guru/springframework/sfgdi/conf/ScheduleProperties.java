package guru.springframework.sfgdi.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.*;

@Primary
@Component
@ConfigurationProperties(prefix = "app.schedule")
public class ScheduleProperties {

    /**
     * Binds ISO date (yyyy‑MM‑dd)
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    /**
     * Binds ISO time (HH:mm:ss)
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime startTime;

    /**
     * Binds custom pattern (yyyy/MM/dd HH:mm)
     */
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime deadline;

    /**
     * Binds Instant using default ISO_INSTANT parser
     */
    private Instant instant;

    /**
     * Binds custom zoned date‑time (yyyy‑MM‑dd HH:mm:ssZ)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private ZonedDateTime zoned;

    // Getters and setters

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }
    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Instant getInstant() {
        return instant;
    }
    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public ZonedDateTime getZoned() {
        return zoned;
    }
    public void setZoned(ZonedDateTime zoned) {
        this.zoned = zoned;
    }
}
