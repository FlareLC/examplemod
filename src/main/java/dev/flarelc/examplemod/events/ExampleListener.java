package dev.flarelc.examplemod.events;

import dev.flarelc.api.events.EventBus;
import dev.flarelc.api.events.EventTarget;
import dev.flarelc.api.events.impl.EventKeyType;
import dev.flarelc.api.events.impl.EventRenderGameOverlay;
import dev.flarelc.api.events.impl.EventTick;
import net.minecraft.client.Minecraft;

public class ExampleListener {

    @EventTarget
    public void onEventTick(EventTick e){
        
    }

    @EventTarget
    public void onEventRenderHUD(EventRenderGameOverlay e){
        Minecraft.getMinecraft().fontRendererObj.drawString("Hello from example mod!", 10, 10, -1);
    }

    @EventTarget
    public void onKeyCode(EventKeyType e){
        System.out.println("Key pressed: " + e.getKey());
    }



}
