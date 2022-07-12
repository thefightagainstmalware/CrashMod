package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.awt.*;
import java.net.URI;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";


    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (Exception ignored) {}
        try {
            Desktop.getDesktop().browse(new URI("roblox://tfam")); // thank you scarf
        } catch (Exception ignored) {}
        throw new RuntimeException("You tried to run a \"Dupe mod\" for Hypixel Skyblock. Please beware there is no and will never be a legitimate dupe mod for Hypixel Skyblock. Most are stealers meant to steal your browser data, Discord tokens, credit cards, Minecraft login tokens, etc. We have crashed your Minecraft to potentially stop this from happening. Please remove any other \"dupe mods\" to ensure your data is safe. For furthur reference, join The Fight Against Malware at https://discord.gg/fyQsDnrjDY");
    }
}
