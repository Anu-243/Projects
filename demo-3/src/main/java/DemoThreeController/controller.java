package DemoThreeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
	@ResponseBody
	@RequestMapping(value="/Signin",method=RequestMethod.GET)
	public String signin()
	{
		return "I'm inside sign-in page";
	}
	@ResponseBody
	@RequestMapping(value="/Signup",method=RequestMethod.GET)
	public String signup()
	{
		return "I'm inside sign-up page";
	}
}