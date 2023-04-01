package com.ngames.nclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.ionar.salhack.main.ForgeEventProcessor;
import me.ionar.salhack.main.SalHack;
import me.ionar.salhack.main.Wrapper;
import me.zero.alpine.fork.bus.EventBus;
import me.zero.alpine.fork.bus.EventManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "nclient", name = "NClient", version = NClientMod.VERSION)
public final class NClientMod
{
    public static final String NAME = "NClient";
    public static final String VERSION = "2.05";

    public static final Logger log = LogManager.getLogger("sal");

    public static final EventBus EVENT_BUS = new EventManager();

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        log.info("init NClient v: " + VERSION);

        SalHack.Init();

        MinecraftForge.EVENT_BUS.register(new ForgeEventProcessor());
    }
}
