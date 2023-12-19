package net.liopyu.mods.entityjs.kube;

import dev.latvian.mods.kubejs.event.EventJS;
import net.liopyu.mods.entityjs.kube.builder.EntityActionsBuilderJS;
import net.minecraft.resources.ResourceLocation;

public class EntityModificationEventJS extends EventJS {
    public EntityActionsBuilderJS create(ResourceLocation id) {
        return new EntityActionsBuilderJS();
    }
}
