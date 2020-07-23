package club.sk1er.hytilities.config;

import club.sk1er.vigilance.Vigilant;
import club.sk1er.vigilance.data.Property;
import club.sk1er.vigilance.data.PropertyType;

import java.io.File;

public class HytilitiesConfig extends Vigilant {

    @Property(
        type = PropertyType.SWITCH, name = "Ad Blocker",
        description = "Remove spam messages, typically advertising something.",
        category = "General", subcategory = "Chat"
    )
    public static boolean hytilitiesAdblock;

    @Property(
        type = PropertyType.SWITCH, name = "Chat Cleaner",
        description = "Remove useless messages from chat.",
        category = "General", subcategory = "Chat"
    )
    public static boolean hytilitiesChatCleaner;

    public HytilitiesConfig() {
        super(new File("./config/hytilities.toml"));
        initialize();
    }
}
