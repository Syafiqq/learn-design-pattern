package bot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 5:03 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/context/Context.xml"})
public class GreetingBot2Test
{
    @Qualifier("goodMorning") @Autowired private
    GreetingBot2 bot3;

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

    @Test public void it_success_implementing_autowired()
    {
        Assert.assertEquals("", "Good Morning Sir!", bot3.greet());
    }
}
