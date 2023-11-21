package net.eclipse.item;

import net.eclipse.Discs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DiscItemGroups {
    public static final ItemGroup Disc = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Discs.MOD_ID, "discs"),
            FabricItemGroup.builder().displayName(Text.translatable("discs.itemgroup.discs"))
                    .icon(() -> new ItemStack(Items.MUSIC_DISC_13)).entries((displayContext, entries) -> {
                        entries.add(Items.MUSIC_DISC_13);
                        entries.add(Items.MUSIC_DISC_CAT);
                        entries.add(Items.MUSIC_DISC_BLOCKS);
                        entries.add(Items.MUSIC_DISC_CHIRP);
                        entries.add(Items.MUSIC_DISC_FAR);
                        entries.add(Items.MUSIC_DISC_MALL);
                        entries.add(Items.MUSIC_DISC_MELLOHI);
                        entries.add(Items.MUSIC_DISC_STAL);
                        entries.add(Items.MUSIC_DISC_STRAD);
                        entries.add(Items.MUSIC_DISC_WARD);
                        entries.add(Items.MUSIC_DISC_11);
                        entries.add(Items.MUSIC_DISC_WAIT);
                        entries.add(Items.MUSIC_DISC_OTHERSIDE);
                        entries.add(Items.MUSIC_DISC_5);
                        entries.add(Items.MUSIC_DISC_PIGSTEP);
                        entries.add(Items.MUSIC_DISC_RELIC);
                        entries.add(DiscItems.MUSIC_DISC_ALIVE);
                        entries.add(DiscItems.MUSIC_DISC_BRUTE);
                        entries.add(DiscItems.MUSIC_DISC_CASCADE);
                        entries.add(DiscItems.MUSIC_DISC_COMET);
                        entries.add(DiscItems.MUSIC_DISC_FOREST);
                        entries.add(DiscItems.MUSIC_DISC_GILDED);
                        entries.add(DiscItems.MUSIC_DISC_GLIDE);
                        entries.add(DiscItems.MUSIC_DISC_GUARDIAN);
                        entries.add(DiscItems.MUSIC_DISC_HUSK);
                        entries.add(DiscItems.MUSIC_DISC_LIGHTNING);
                        entries.add(DiscItems.MUSIC_DISC_LUMINOUS);
                        entries.add(DiscItems.MUSIC_DISC_NORTHERN_LIGHTS);
                        entries.add(DiscItems.MUSIC_DISC_OCHRE);
                        entries.add(DiscItems.MUSIC_DISC_OVERTUNE);
                        entries.add(DiscItems.MUSIC_DISC_PUMPKIN);
                        entries.add(DiscItems.MUSIC_DISC_RAIDERS);
                        entries.add(DiscItems.MUSIC_DISC_SHRIEKER);
                        entries.add(DiscItems.MUSIC_DISC_SHULKER);
                        entries.add(DiscItems.MUSIC_DISC_SLEIGH);
                        entries.add(DiscItems.MUSIC_DISC_SNOWSTORM);
                        entries.add(DiscItems.MUSIC_DISC_SOULLESS);
                        entries.add(DiscItems.MUSIC_DISC_STORM);
                        entries.add(DiscItems.MUSIC_DISC_STRIDE);
                        entries.add(DiscItems.MUSIC_DISC_THE_ENDER_DRAGON);
                        entries.add(DiscItems.MUSIC_DISC_THE_WITHER);
                        entries.add(DiscItems.MUSIC_DISC_TUNDRA);
                        entries.add(DiscItems.MUSIC_DISC_UNDERSCORE);
                        entries.add(DiscItems.MUSIC_DISC_WARDEN_RUN);
                    }).build());


    public static void registerItemGroups() {
        Discs.LOGGER.info("Registering Item Groups for " + Discs.MOD_ID);
    }
}