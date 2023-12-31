package net.liopyu.root;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.script.BindingsEvent;
import dev.latvian.mods.kubejs.script.ScriptType;
import dev.latvian.mods.kubejs.script.ScriptTypePredicate;
import dev.latvian.mods.kubejs.event.EventHandler;

public class EntityJsEvent {
    // Define your custom event and registration logic here

    public static void registerEvents() {
        // Register the EntityJs event within the 'entityjs' event group during STARTUP
        EventGroup.of("EntityJS").add("EntityJS", (ScriptTypePredicate) ScriptType.STARTUP, () -> {
            BindingsEvent event = new BindingsEvent(ScriptType.STARTUP.manager.get(), ScriptType.STARTUP.manager.get().topLevelScope);
            // Add any necessary bindings for EntityJs
            event.add("EntityJS", new EntityJsBindings(event));

            // Add additional registrations if needed
            return null;
        });
    }

    public static class EntityJsBindings {
        private final BindingsEvent event;

        public EntityJsBindings(BindingsEvent event) {
            this.event = event;
        }

        // Add methods and logic for EntityJsBindings
    }
}
