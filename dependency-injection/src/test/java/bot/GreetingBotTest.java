package bot;

import bot.injector.GoodAfternoonInjector;
import bot.injector.GoodMorningInjector;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import service.greeting.GoodMorningService;
import service.greeting.GreetingConsumer;
import service.greeting.GreetingService;
import service.greeting.GreetingServiceInjector;

/*
 * This <pattern> created by :
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 4:07 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class GreetingBotTest
{
    private GreetingService service;

    @Before
    public void setUp() throws Exception
    {
        this.service = Mockito.mock(GoodMorningService.class);
    }

    @Test public void it_call_once()
    {
        final GreetingBot1 bot = new GreetingBot1();
        bot.setService(this.service);
        bot.greet();
        Mockito.verify(this.service, Mockito.times(1)).greet();
    }

    @Test public void it_greet_good_morning_or_afternoon_sir()
    {
        GreetingServiceInjector injector;
        GreetingConsumer consumer;

        injector = new GoodMorningInjector();
        consumer = injector.getConsumer();
        Assert.assertEquals("", "Good Morning Sir!", consumer.greet());

        injector = new GoodAfternoonInjector();
        consumer = injector.getConsumer();
        Assert.assertEquals("", "Good Afternoon Sir!", consumer.greet());
    }

    @After
    public void tearDown() throws Exception
    {
        this.service = null;
    }
}
