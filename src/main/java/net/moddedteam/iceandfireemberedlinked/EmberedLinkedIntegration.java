package net.moddedteam.iceandfireemberedlinked;

import net.minecraftforge.fml.ModList;

public class EmberedLinkedIntegration {
    private static final String ICE_AND_FIRE_MODID = "iceandfire";
    private static final String EMBERS_REKINDLED_MODID = "embers";

    public static boolean isIceAndFireLoaded() {
        return ModList.get().isLoaded(ICE_AND_FIRE_MODID);
    }

    public static boolean isEmbersRekindledLoaded() {
        return ModList.get().isLoaded(EMBERS_REKINDLED_MODID);
    }

    public static void logModStatus() {
        System.out.println("Ice and Fire présent : " + isIceAndFireLoaded());
        System.out.println("Embers Rekindled présent : " + isEmbersRekindledLoaded());
    }
}
