@Controller
public class MasterController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}