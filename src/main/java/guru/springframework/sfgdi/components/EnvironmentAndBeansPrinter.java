package guru.springframework.sfgdi.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.stereotype.Component;
import org.springframework.core.env.*;
import java.util.*;

@Component
public class EnvironmentAndBeansPrinter implements CommandLineRunner {
    private final ConfigurableEnvironment environment;
    private final ApplicationContext context;

    public EnvironmentAndBeansPrinter(ConfigurableEnvironment environment, ApplicationContext context) {
        this.environment = environment;
        this.context = context;
    }


    @Override
    public void run(String... args) throws Exception {
        printAllProperties();
        printAllBeanNames();
    }

    private void printAllProperties() {
        System.out.println("=== All Environment Properties ===");

        // Use a SortedSet to avoid duplicates and for alphabetical order
        Set<String> propertyNames = new TreeSet<>();

        for (PropertySource<?> ps : environment.getPropertySources()) {
            if (ps instanceof EnumerablePropertySource<?>) {
                propertyNames.addAll(Arrays.asList(((EnumerablePropertySource<?>) ps).getPropertyNames()));
            }
        }

        for (String name : propertyNames) {
            String value = environment.getProperty(name);
            System.out.printf("%s = %s%n", name, value);
        }
        System.out.println("=== End of Properties ===\n");
    }

    private void printAllBeanNames() {
        System.out.println("=== All Bean Names in ApplicationContext ===");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        System.out.println("=== End of Bean Names ===");
    }
}
