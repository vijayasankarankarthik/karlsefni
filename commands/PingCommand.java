import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class PingCommand {
    public static void execute(MessageReceivedEvent event) {
        event.getChannel().sendMessage("Pong").queue();
    }
}
