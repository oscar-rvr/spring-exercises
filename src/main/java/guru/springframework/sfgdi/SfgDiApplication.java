package guru.springframework.sfgdi;

import guru.springframework.sfgdi.services.ScheduleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		ScheduleService scheduleService = ctx.getBean(ScheduleService.class);
		scheduleService.printSchedule();
	}

}
