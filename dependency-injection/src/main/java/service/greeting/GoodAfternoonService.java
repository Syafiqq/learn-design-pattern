package service.greeting;

import org.springframework.stereotype.Component;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 10 July 2017, 3:59 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
@Component
public class GoodAfternoonService implements GreetingService
{
    @Override public String greet()
    {
        return "Good Afternoon Sir!";
    }
}
