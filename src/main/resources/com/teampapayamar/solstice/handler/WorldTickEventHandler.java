package com.teampapayamar.solstice.handler;

import com.teampapayamar.solstice.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class WorldTickEventHandler
{
    @SubscribeEvent
    public void onWorldTickEvent(TickEvent.WorldTickEvent event)
    {
        LogHelper.info(event.world.getTotalWorldTime());
    }
}