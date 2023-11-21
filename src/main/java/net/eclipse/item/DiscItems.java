package net.eclipse.item;

import net.eclipse.Discs;
import net.eclipse.sound.DiscSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DiscItems {
    public static final Item MUSIC_DISC_ALIVE = registerItem("music_disc_alive",
            new MusicDiscItem(7, DiscSounds.ALIVE, new FabricItemSettings().maxCount(1), 91));
    public static final Item MUSIC_DISC_BRUTE = registerItem("music_disc_brute",
            new MusicDiscItem(7, DiscSounds.BRUTE, new FabricItemSettings().maxCount(1), 93));
    public static final Item MUSIC_DISC_CASCADE = registerItem("music_disc_cascade",
            new MusicDiscItem(7, DiscSounds.CASCADE, new FabricItemSettings().maxCount(1), 152));
    public static final Item MUSIC_DISC_COMET = registerItem("music_disc_comet",
            new MusicDiscItem(7, DiscSounds.COMET, new FabricItemSettings().maxCount(1), 171));
    public static final Item MUSIC_DISC_FOREST = registerItem("music_disc_forest",
            new MusicDiscItem(7, DiscSounds.FOREST, new FabricItemSettings().maxCount(1), 144));
    public static final Item MUSIC_DISC_GILDED = registerItem("music_disc_gilded",
            new MusicDiscItem(7, DiscSounds.GILDED, new FabricItemSettings().maxCount(1), 131));
    public static final Item MUSIC_DISC_GLIDE = registerItem("music_disc_glide",
            new MusicDiscItem(7, DiscSounds.GLIDE, new FabricItemSettings().maxCount(1), 123));
    public static final Item MUSIC_DISC_GUARDIAN = registerItem("music_disc_guardian",
            new MusicDiscItem(7, DiscSounds.GUARDIAN, new FabricItemSettings().maxCount(1), 141));
    public static final Item MUSIC_DISC_HUSK = registerItem("music_disc_husk",
            new MusicDiscItem(7, DiscSounds.HUSK, new FabricItemSettings().maxCount(1), 128));
    public static final Item MUSIC_DISC_LIGHTNING = registerItem("music_disc_lightning",
            new MusicDiscItem(7, DiscSounds.LIGHTNING, new FabricItemSettings().maxCount(1), 139));
    public static final Item MUSIC_DISC_LUMINOUS = registerItem("music_disc_luminous",
            new MusicDiscItem(7, DiscSounds.LUMINOUS, new FabricItemSettings().maxCount(1), 93));
    public static final Item MUSIC_DISC_NORTHERN_LIGHTS = registerItem("music_disc_northern_lights",
            new MusicDiscItem(7, DiscSounds.NORTHERN_LIGHTS, new FabricItemSettings().maxCount(1), 131));
    public static final Item MUSIC_DISC_OCHRE = registerItem("music_disc_ochre",
            new MusicDiscItem(7, DiscSounds.OCHRE, new FabricItemSettings().maxCount(1), 161));
    public static final Item MUSIC_DISC_OVERTUNE = registerItem("music_disc_overtune",
            new MusicDiscItem(7, DiscSounds.OVERTUNE, new FabricItemSettings().maxCount(1), 105));
    public static final Item MUSIC_DISC_PUMPKIN = registerItem("music_disc_pumpkin",
            new MusicDiscItem(7, DiscSounds.PUMPKIN, new FabricItemSettings().maxCount(1), 95));
    public static final Item MUSIC_DISC_RAIDERS = registerItem("music_disc_raiders",
            new MusicDiscItem(7, DiscSounds.RAIDERS, new FabricItemSettings().maxCount(1), 182));
    public static final Item MUSIC_DISC_SHRIEKER = registerItem("music_disc_shrieker",
            new MusicDiscItem(7, DiscSounds.SHRIEKER, new FabricItemSettings().maxCount(1), 141));
    public static final Item MUSIC_DISC_SHULKER = registerItem("music_disc_shulker",
            new MusicDiscItem(7, DiscSounds.SHULKER, new FabricItemSettings().maxCount(1),125 ));
    public static final Item MUSIC_DISC_SLEIGH = registerItem("music_disc_sleigh",
            new MusicDiscItem(7, DiscSounds.SLEIGH, new FabricItemSettings().maxCount(1), 102));
    public static final Item MUSIC_DISC_SNOWSTORM = registerItem("music_disc_snowstorm",
            new MusicDiscItem(7, DiscSounds.SNOWSTORM, new FabricItemSettings().maxCount(1), 170));
    public static final Item MUSIC_DISC_SOULLESS = registerItem("music_disc_soulless",
            new MusicDiscItem(7, DiscSounds.SOULLESS, new FabricItemSettings().maxCount(1), 171));
    public static final Item MUSIC_DISC_STORM = registerItem("music_disc_storm",
            new MusicDiscItem(7, DiscSounds.STORM, new FabricItemSettings().maxCount(1), 19));
    public static final Item MUSIC_DISC_STRIDE = registerItem("music_disc_stride",
            new MusicDiscItem(7, DiscSounds.STRIDE, new FabricItemSettings().maxCount(1), 151));
    public static final Item MUSIC_DISC_THE_ENDER_DRAGON = registerItem("music_disc_the_ender_dragon",
            new MusicDiscItem(7, DiscSounds.THE_ENDER_DRAGON, new FabricItemSettings().maxCount(1), 171));
    public static final Item MUSIC_DISC_THE_WITHER = registerItem("music_disc_the_wither",
            new MusicDiscItem(7, DiscSounds.THE_WITHER, new FabricItemSettings().maxCount(1), 144));
    public static final Item MUSIC_DISC_TUNDRA = registerItem("music_disc_tundra",
            new MusicDiscItem(7, DiscSounds.TUNDRA, new FabricItemSettings().maxCount(1), 112));
    public static final Item MUSIC_DISC_UNDERSCORE = registerItem("music_disc_underscore",
            new MusicDiscItem(7, DiscSounds.UNDERSCORE, new FabricItemSettings().maxCount(1), 130));
    public static final Item MUSIC_DISC_WARDEN_RUN = registerItem("music_disc_warden_run",
            new MusicDiscItem(7, DiscSounds.WARDEN_RUN, new FabricItemSettings().maxCount(1), 185));


    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(MUSIC_DISC_ALIVE);
        entries.add(MUSIC_DISC_BRUTE);
        entries.add(MUSIC_DISC_CASCADE);
        entries.add(MUSIC_DISC_COMET);
        entries.add(MUSIC_DISC_FOREST);
        entries.add(MUSIC_DISC_GILDED);
        entries.add(MUSIC_DISC_GLIDE);
        entries.add(MUSIC_DISC_GUARDIAN);
        entries.add(MUSIC_DISC_HUSK);
        entries.add(MUSIC_DISC_LIGHTNING);
        entries.add(MUSIC_DISC_LUMINOUS);
        entries.add(MUSIC_DISC_NORTHERN_LIGHTS);
        entries.add(MUSIC_DISC_OCHRE);
        entries.add(MUSIC_DISC_OVERTUNE);
        entries.add(MUSIC_DISC_PUMPKIN);
        entries.add(MUSIC_DISC_RAIDERS);
        entries.add(MUSIC_DISC_SHRIEKER);
        entries.add(MUSIC_DISC_SHULKER);
        entries.add(MUSIC_DISC_SLEIGH);
        entries.add(MUSIC_DISC_SNOWSTORM);
        entries.add(MUSIC_DISC_SOULLESS);
        entries.add(MUSIC_DISC_STORM);
        entries.add(MUSIC_DISC_STRIDE);
        entries.add(MUSIC_DISC_THE_ENDER_DRAGON);
        entries.add(MUSIC_DISC_THE_WITHER);
        entries.add(MUSIC_DISC_TUNDRA);
        entries.add(MUSIC_DISC_UNDERSCORE);
        entries.add(MUSIC_DISC_WARDEN_RUN);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Discs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Discs.LOGGER.info("Registering Mod Items for " + Discs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(DiscItems::addItemsToToolsItemGroup);
    }
}