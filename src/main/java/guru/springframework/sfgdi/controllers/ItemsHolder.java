package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ItemsHolder {
    @Value("#{'${app.items}'.split('-')}")
    private String[] items;

    public String[] getItems() {
        return items;
    }
}
