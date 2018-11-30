package test1.test2.test3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping(value="/testButton", method=RequestMethod.POST)
	public String testButton(Locale locale, Model model) {
		String  myXml = "testBean.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(myXml);
		ValueClass valueClass = ctx.getBean("valueClass",ValueClass.class);
		System.out.println(valueClass.getStr());
		System.out.println(valueClass.getValue());
		ctx.close();
		return "testButton";
	}
	
	@RequestMapping(value ="/testButton2", method=RequestMethod.POST)
	public String testButton2(Model model) {
		String myXml = "Pencil.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(myXml);
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		model.addAttribute("testValue",123);
		return "testButton2";
	}
	@RequestMapping(value="/testForm123", method=RequestMethod.POST)
	public String testForm123() {
		System.out.println("abc");
		return "testKogamen";
	}
	

	@RequestMapping(value="/testButton3", method=RequestMethod.GET)
	public void testbutton3(Member Member) {
	
	}

	
}