package io.github.eleentyasi.dweebscape_origins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Dweebscape_origins implements ModInitializer {

    public static final Item ELEENITEM = new Item(new FabricItemSettings());
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","eleenitem"), ELEENITEM);


    }
}
