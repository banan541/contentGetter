package getter;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "")

public class ContentController {

    @GetMapping(value = "/text")
    public String getText(@RequestAttribute String url){
        return getText(url);
    }

    @GetMapping(value = "/img")
    public String getImg(@RequestAttribute String url) {
        return getImg(url);
    }
}
