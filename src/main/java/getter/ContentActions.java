package getter;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class ContentActions{

@EventListener(ApplicationReadyEvent.class)
    public void GetContentAction() {
            System.out.println("hello world, I have just started up");

    }


}