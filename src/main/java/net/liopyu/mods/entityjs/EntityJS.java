package net.liopyu.mods.entityjs;

import net.liopyu.mods.entityjs.kube.EntityJSEvent;
import net.liopyu.mods.entityjs.kube.EntityModificationEventJS;
import net.minecraft.core.Registry;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EntityJS.MOD_ID)
public class EntityJS {
    public static final String MOD_ID = "entityjs";

    private static final Logger LOGGER = LogManager.getLogger();

    public EntityJS() {
        LOGGER.info("Loading EntityJS-Liopyu");
    }

    @SubscribeEvent
    public static void onEntityRegistry(RegisterEvent event) {
        if (event.getRegistryKey() == Registry.ENTITY_TYPE_REGISTRY) {
            EntityJSEvent.ENTITYREGISTRY.post(new EntityModificationEventJS());
        }
    }

    public static void register() {
        // Register your entities here
        // Call the appropriate function from your mod to register the entities
        EntityJSEvent.GROUP.register();
    }
}