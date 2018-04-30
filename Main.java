package bot.discord;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.*;
import javax.security.auth.login.LoginException;
public class Main
{
	public static JDA jda;
	public static void main(String[] args)
	{
		JDABuilder builder=new JDABuilder(AccountType.BOT);
		builder.setToken("NDI3MDUzOTkzODg2MjIwMjg4.DchbPw.TN1AbxuzdXzMKHJCC8rKGEM1WjM");
		builder.setAutoReconnect(true);
		builder.setStatus(OnlineStatus.IDLE);
		try
		{
			jda=builder.buildBlocking();
		}catch(RateLimitedException e)
		{
			e.printStackTrace();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}catch(LoginException e)
		{
			e.printStackTrace();
		}
	}
}
