import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String[] args = event.getMessage().getContentRaw().split(" ");
        String command = args[0];

        switch (command) {
            case "!ping":
                PingCommand.execute(event);
                break;

            case "!help":
                HelpCommand.execute(event);
                break;

            case "!kick":
                KickCommand.execute(event, args);
                break;

            case "!ban":
                BanCommand.execute(event, args);
                break;
        }
    }
}
