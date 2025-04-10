package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controllers.ItemsHolder;
import org.springframework.stereotype.Service;

@Service
public class BestStringService {
    private final ItemsHolder itemsHolder;

    public BestStringService(ItemsHolder itemsHolder) {
        this.itemsHolder = itemsHolder;
    }

    public void print() {
        for (String item : itemsHolder.getItems()) {
            System.out.println(item);
        }
    }
}
