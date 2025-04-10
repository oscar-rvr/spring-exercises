# SPeL Injection

The Spring Expression Language (SpEL) is a powerful expression language that supports querying and manipulating an object graph at runtime. We can use it with XML or annotation-based Spring configurations.

## Creating the property
In **`src/main/resources/application.properties`**:

```properties
# A single property whose value is elements separated by '-'
app.items=foo-bar-baz-qux 
```

## Inject with @Value + SpEL split
In any Spring‐managed bean (e.g. @Component, @Service, or a @Configuration class), you can write:

```java
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class ItemsHolder {

    /**
     * SpEL: 
     *   - '${app.items}' resolves to the literal "foo-bar-baz-qux"
     *   - split('-') turns it into String[]{ "foo", "bar", "baz", "qux" }
     */
    @Value("#{'${app.items}'.split('-')}")
    private String[] items;

    public String[] getItems() {
        return items;
    }
}
```

## Usage in application
You can now autowire this bean anywhere

```java
@Service
public class SomeService {

    private final ItemsHolder itemsHolder;

    public SomeService(ItemsHolder itemsHolder) {
        this.itemsHolder = itemsHolder;
    }

    public void doSomething() {
        for (String item : itemsHolder.getItems()) {
            System.out.println(item);
        }
    }
}
```



## Result
<img width="144" alt="Screenshot 2025-04-10 at 11 52 56 a m" src="https://github.com/user-attachments/assets/3c1303e7-d5f8-4394-87a3-7c576427cdda" />

