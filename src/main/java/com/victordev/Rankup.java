package com.victordev;

import com.victordev.database.Database;
import org.bukkit.plugin.java.JavaPlugin;

public final class Rankup extends JavaPlugin {

    Database DB = new Database();

    @Override
    public void onEnable() {
        DB.send();
    }

    @Override
    public void onDisable() {
        DB.disconnect();
    }
}
