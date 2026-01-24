import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("PUT_YOUR_BOT_TOKEN")
                .addEventListeners(new CommandListener())
                .build();
    }
}
