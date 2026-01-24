import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class KickCommand {
    public static void execute(MessageReceivedEvent event, String[] args) {
        if (!event.getMember().hasPermission(Permission.KICK_MEMBERS)) {
            event.getChannel().sendMessage("You don't have permission to kick users.").queue();
            return;
        }

        if (event.getMessage().getMentionedMembers().isEmpty()) {
            event.getChannel().sendMessage("Mention a user to kick.").queue();
            return;
        }

        Member target = event.getMessage().getMentionedMembers().get(0);
        target.kick().queue();

        event.getChannel().sendMessage("User kicked successfully.").queue();
    }
}
