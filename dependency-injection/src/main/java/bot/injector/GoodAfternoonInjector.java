package bot.injector;

import bot.GreetingBot1;
import service.greeting.GoodAfternoonService;
import service.greeting.GreetingConsumer;
import service.greeting.GreetingServiceInjector;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 4:42 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class GoodAfternoonInjector implements GreetingServiceInjector
{
    @Override public GreetingConsumer getConsumer()
    {
        GreetingBot1 bot = new GreetingBot1();
        bot.setService(new GoodAfternoonService());
        return bot;
    }
}
