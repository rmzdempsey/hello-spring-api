package hello;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

//    @RequestMapping(value = PATH)
//    public ModelAndView error() {
//        ModelAndView mav = new ModelAndView();
//
//        mav.setViewName("error");
//        mav.addObject("errorName", "RMD");
//
//        return mav;
//    }

    /* this works - not ideal */
    @RequestMapping(value = PATH)
    public String error() {
        return "<html><head></head><body><h1>Error handling</h1></body></html>";

    }

        @Override
    public String getErrorPath() {
        return PATH;
    }
}