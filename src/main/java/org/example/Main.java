package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("MTA4MjMxMTExNjUyMjI3NDg3Ng.GDrrop.xwkg1gJMmjsZzWv7_iHNIQwAQIcSPGXUWl7has").build();
        //You can also add event listeners to the already built JDA instance
        // Note that some events may not be received if the listener is added after calling build()
        // This includes events such as the ReadyEvent
        jda.addEventListener(new Main());

    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // 받은 메세지 내용이 !ping이라면
        if (event.getMessage().getContentRaw().equals("!ping")) {
            // pong라는 내용을 보낸다.
            event.getChannel().sendMessage("pong!").queue();
        }
    }
}