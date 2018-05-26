package Main

import sx.blah.discord.api.ClientBuilder
import sx.blah.discord.api.events.EventSubscriber
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent
import sx.blah.discord.api.IDiscordClient


object Main {
  def main(args : Array[String]): Unit ={
    val Botmain = new BotMain
    Botmain.Run()
  }
}

class BotMain{
  def Run(): Unit ={
    val builder = new ClientBuilder
    val client = builder.withToken("NDQ4MDk1NzgwNDU3MjgzNTk0.Dep0IA.zAM5dSFx_R7Z_z1HjufSe2usGwY").build()
    client.getDispatcher().registerListener(new EventHandle)

    client.login()
  }
}

class EventHandle{
  @EventSubscriber
  def onMessageReceivedEvent(event : MessageReceivedEvent): Unit ={
    val msg = event.getMessage()
    val text = msg.getContent()
    val channel = event.getChannel()
    text match{
      case "test" =>
        channel.sendMessage("Test")
    }
  }
}
