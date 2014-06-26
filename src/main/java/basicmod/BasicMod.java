package basicmod;

import basicmod.proxy.IProxy;
import basicmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "1.7.2-1.0")
public class BasicMod {
	
	@SidedProxy(clientSide=Reference.PROXY_CLASS_CLIENT, serverSide=Reference.PROXY_CLASS_SERVER)
	public static IProxy proxy;
	
    @Mod.Instance(Reference.MOD_ID)
    public static BasicMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	// TODO: register blocks
    	// TODO: register items
    	// TODO: register entities
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	// TODO: register tile entities
    	// TODO: register event handlers
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
    
    /*
    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event) {}
    
    @Mod.EventHandler
	public void onServerStart(FMLServerStartingEvent event) {}
	
	@Mod.EventHandler
	public void onServerStop(FMLServerStoppingEvent event) {}
    */
}
