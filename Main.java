import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("") //i have removed the bot deployment.
                .addEventListeners(new CommandListener())
                .build();
    }
}
