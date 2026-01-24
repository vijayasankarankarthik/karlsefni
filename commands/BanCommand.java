import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class BanCommand {
    public static void execute(MessageReceivedEvent event, String[] args) {
        if (!event.getMember().hasPermission(Permission.BAN_MEMBERS)) {
            event.getChannel().sendMessage("You don't have permission to ban users.").queue();
            return;
        }

        if (event.getMessage().getMentionedMembers().isEmpty()) {
            event.getChannel().sendMessage("Mention a user to ban.").queue();
            return;
        }

        Member target = event.getMessage().getMentionedMembers().get(0);
        target.ban(1).queue();

        event.getChannel().sendMessage("User banned successfully.").queue();
    }
}
