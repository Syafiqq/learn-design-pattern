package bot;

import context.Context;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.greeting.GreetingService;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 5:03 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Context.class})
public class GreetingBot2TestJavaContextConstAutowired
{
    @Qualifier(value = "goodMorning") @Autowired private
    GreetingBot2 bot3;

    @Autowired private
    GreetingService goodMorningService;

    @Autowired @Qualifier(value = "goodMorningService") private
    GreetingService greetService;

    @Test public void it_greet_good_morning_sir()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context/Context.xml");
        GreetingBot2 bot = context.getBean("goodMorning", GreetingBot2.class);
        Assert.assertEquals("", "Good Morning Sir!", bot.greet());
    }

    @Test public void it_greet_good_afternoon_sir()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context/Context.xml");
        GreetingBot2 bot = context.getBean("goodAfternoon", GreetingBot2.class);
        Assert.assertEquals("", "Good Afternoon Sir!", bot.greet());
    }

    @Test public void it_success_implementing_autowired_with_qualifier_from_context()
    {
        Assert.assertEquals("", "Good Morning Sir!", bot3.greet());
    }

    @Test public void it_success_implementing_autowired_direct_var_name()
    {
        Assert.assertEquals("", "Good Morning Sir!", goodMorningService.greet());
    }

    @Test public void it_success_implementing_autowired_with_qualifier()
    {
        Assert.assertEquals("", "Good Morning Sir!", greetService.greet());
    }
}
