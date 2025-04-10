package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.conf.ScheduleProperties;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private final ScheduleProperties props;

    public ScheduleService(ScheduleProperties props) {
        this.props = props;
    }

    public void printSchedule() {
        System.out.println("Start Date : " + props.getStartDate());
        System.out.println("Start Time : " + props.getStartTime());
        System.out.println("Deadline   : " + props.getDeadline());
        System.out.println("Instant    : " + props.getInstant());
        System.out.println("Zoned Time : " + props.getZoned());
    }
}
