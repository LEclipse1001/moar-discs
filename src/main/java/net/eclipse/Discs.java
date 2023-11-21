package net.eclipse;

import net.eclipse.item.DiscItemGroups;
import net.eclipse.item.DiscItems;
import net.eclipse.util.DiscLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Discs implements ModInitializer {
    public static final String MOD_ID = "discs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        DiscItems.registerModItems();
        DiscItemGroups.registerItemGroups();

        DiscLootTableModifiers.modifyLootTables();

    }

}