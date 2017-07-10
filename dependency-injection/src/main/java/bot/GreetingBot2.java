package bot;

import service.greeting.GreetingConsumer;
import service.greeting.GreetingService;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 4:56 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class GreetingBot2 implements GreetingConsumer
{
    public final GreetingService service;

    public GreetingBot2(GreetingService service)
    {
        this.service = service;
    }

    public String greet()
    {
        return this.service.greet();
    }
}

