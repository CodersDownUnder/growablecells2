package net.codersdownunder.growablecells.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.filter.AbstractFilter;
import org.apache.logging.log4j.message.Message;

import java.util.regex.Pattern;

@Plugin(name = "Log4jFilter", category = "Core", elementType = "filter", printObject = true)
public final class LogFilter extends AbstractFilter {
    @Override
    public Result filter(final LogEvent event) {
        Message m = event.getMessage();
        String s = m.getFormattedMessage();
            if (s.contains("Missing textures in model growablecells:")) {
                //FlowerSeeds.LOGGER.info("Removing Log Message");
                return Result.DENY;
            }

            if (s.contains("Skipping loading recipe growablecells:")) {
                return Result.DENY;
            }



        return null;
    }

    public static void apply() {
        ((Logger) LogManager.getRootLogger()).addFilter(new LogFilter());
    }
}