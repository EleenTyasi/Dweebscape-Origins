package io.github.eleentyasi.dweebscape_origins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class Dweebscape_origins implements ModInitializer {
    public static final Item AETHERIAITEM = new Item(new FabricItemSettings());
    public static final Item ELEENITEM = new Item(new FabricItemSettings());
    public static final Item BONNIEITEM = new Item(new FabricItemSettings());
    public static final Item DWEEBITEM = new Item(new FabricItemSettings());
    public static final Item FAWFULITEM = new Item(new FabricItemSettings());
    public static final Item NICOITEM = new Item(new FabricItemSettings());
    public static final Item FERIITEM = new Item(new FabricItemSettings());
    public static final Item THRYMEITEM = new Item(new FabricItemSettings());
    public static final Item MIMICITEM = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","eleenitem"), ELEENITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","aetheriaitem"), AETHERIAITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","bonnieitem"), BONNIEITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","dweebitem"), DWEEBITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","fawfulitem"), FAWFULITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","nicoitem"), NICOITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","feriitem"), FERIITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","thrymeitem"), THRYMEITEM);
        Registry.register(Registries.ITEM, new Identifier("dweebscape_origins","mimicitem"), MIMICITEM);
    }
}
