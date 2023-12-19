package net.liopyu.mods.entityjs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import net.liopyu.mods.entityjs.kube.EntityJSEvent;
import net.liopyu.mods.entityjs.kube.EntityModificationEventJS;

public class EntityJSPlugin extends KubeJSPlugin {

    @Override
    public void registerEvents() {
        EntityJSEvent.GROUP.register();
        EntityJSEvent.ENTITYREGISTRY.post(new EntityModificationEventJS());
    }
}
