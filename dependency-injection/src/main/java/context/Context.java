package context;

import bot.GreetingBot2;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.greeting.GoodAfternoonService;
import service.greeting.GoodMorningService;
import service.greeting.GreetingService;

/*
 * This <pattern> created by : 
 * Name         : syafiq
 * Date / Time  : 11 July 2017, 5:07 PM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
@Configuration
@ComponentScan(basePackages = "service.greeting")
public class Context
{
    @Bean
    public GreetingBot2 goodMorning()
    {
        @NotNull final GreetingService service = new GoodMorningService();
        @NotNull final GreetingBot2 bot = new GreetingBot2(service);
        return bot;
    }

    @Bean
    public GreetingBot2 goodAfternoon()
    {
        @NotNull final GreetingService service = new GoodAfternoonService();
        @NotNull final GreetingBot2 bot = new GreetingBot2(service);
        return bot;
    }
}
