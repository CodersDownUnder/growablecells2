//package net.codersdownunder.growablecells.config;
//
//import java.nio.file.Path;
//
//import com.electronwill.nightconfig.core.file.CommentedFileConfig;
//import com.electronwill.nightconfig.core.io.WritingMode;
//
//import net.minecraftforge.common.ForgeConfigSpec;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.config.ModConfig;
//
//@Mod.EventBusSubscriber
//public class GrowableStorageConfig {
//
//    public static final String CATEGORY_GENERAL = "general";
//
//    public static ForgeConfigSpec SERVER_CONFIG;
//    public static ForgeConfigSpec CLIENT_CONFIG;
//
//    public static ForgeConfigSpec.BooleanValue tag_seed;
//
//
//    static {
//
//        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
//       //ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
//
//        
//        SERVER_BUILDER.push(CATEGORY_GENERAL);
//        tag_seed = SERVER_BUILDER.comment("use forge:seeds tag instead of wheat seeds in recipes").define("tagseeds", false);
//        SERVER_BUILDER.pop();
//
//
//        SERVER_CONFIG = SERVER_BUILDER.build();
//        //CLIENT_CONFIG = CLIENT_BUILDER.build();
//    }
//    
//    public static void loadConfig(ForgeConfigSpec spec, Path path) {
//
//        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
//                .sync()
//                .autosave()
//                .writingMode(WritingMode.REPLACE)
//                .build();
//
//        configData.load();
//        spec.setConfig(configData);
//        
//    }
//
// 
//    @SubscribeEvent
//    public static void onLoad(final ModConfig.Loading configEvent) {
//
//    }
//
//    @SubscribeEvent
//    public static void onReload(final ModConfig.Reloading configEvent) {
//    }
//}