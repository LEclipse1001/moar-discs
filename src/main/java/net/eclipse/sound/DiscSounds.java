package net.eclipse.sound;

import net.eclipse.Discs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class DiscSounds {
    public static final SoundEvent ALIVE = registerSoundEvent("alive");
    public static final SoundEvent BRUTE = registerSoundEvent("brute");
    public static final SoundEvent CASCADE = registerSoundEvent("cascade");
    public static final SoundEvent COMET = registerSoundEvent("comet");
    public static final SoundEvent FOREST = registerSoundEvent("forest");
    public static final SoundEvent GILDED = registerSoundEvent("gilded");
    public static final SoundEvent GLIDE = registerSoundEvent("glide");
    public static final SoundEvent GUARDIAN = registerSoundEvent("guardian");
    public static final SoundEvent HUSK = registerSoundEvent("husk");
    public static final SoundEvent LIGHTNING = registerSoundEvent("lightning");
    public static final SoundEvent LUMINOUS = registerSoundEvent("luminous");
    public static final SoundEvent NORTHERN_LIGHTS = registerSoundEvent("northern_lights");
    public static final SoundEvent OCHRE = registerSoundEvent("ochre");
    public static final SoundEvent OVERTUNE = registerSoundEvent("overtune");
    public static final SoundEvent PUMPKIN = registerSoundEvent("pumpkin");
    public static final SoundEvent RAIDERS = registerSoundEvent("raiders");
    public static final SoundEvent SHRIEKER = registerSoundEvent("shrieker");
    public static final SoundEvent SHULKER = registerSoundEvent("shulker");
    public static final SoundEvent SLEIGH = registerSoundEvent("sleigh");
    public static final SoundEvent SNOWSTORM = registerSoundEvent("snowstorm");
    public static final SoundEvent SOULLESS = registerSoundEvent("soulless");
    public static final SoundEvent STORM = registerSoundEvent("storm");
    public static final SoundEvent STRIDE = registerSoundEvent("stride");
    public static final SoundEvent THE_ENDER_DRAGON = registerSoundEvent("the_ender_dragon");
    public static final SoundEvent THE_WITHER = registerSoundEvent("the_wither");
    public static final SoundEvent TUNDRA = registerSoundEvent("tundra");
    public static final SoundEvent UNDERSCORE = registerSoundEvent("underscore");
    public static final SoundEvent WARDEN_RUN = registerSoundEvent("warden_run");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Discs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Discs.LOGGER.info("Registering Sounds for " + Discs.MOD_ID);
    }
}