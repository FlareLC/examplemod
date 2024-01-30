package dev.flarelc.examplemod;


import dev.flarelc.api.Module;
import dev.flarelc.api.ModuleInfo;
import dev.flarelc.api.events.EventBus;
import dev.flarelc.examplemod.events.ExampleListener;
import net.minecraft.client.Minecraft;

@ModuleInfo(
        name = "ExampleMod",
        version = "1.0",
        author = "FlareLC",
        description = "An example mod for the Flare Mod Loader"
)
public class ExampleMod extends Module {


    @Override
    public void onLoad(){
        System.out.println("ExampleMod loaded!");
        EventBus.register(new ExampleListener());
        System.out.println("ExampleListener registered!");

    }

}
