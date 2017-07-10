package bot;

import service.greeting.GreetingConsumer;
import service.greeting.GreetingService;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 4:00 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class GreetingBot1 implements GreetingConsumer
{
    private GreetingService service;

    public GreetingBot1()
    {
    }

    public void setService(GreetingService service)
    {
        this.service = service;
    }

    public String greet()
    {
        return this.service.greet();
    }
}
