import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class HelpCommand {
    public static void execute(MessageReceivedEvent event) {
        event.getChannel().sendMessage(
                "Commands:\n" +
                "!ping - Check bot status\n" +
                "!kick @user - Kick a user\n" +
                "!ban @user - Ban a user"
        ).queue();
    }
}
