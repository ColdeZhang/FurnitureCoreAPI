package cn.lunadeer.furnitureCoreApi.managers;

import org.bukkit.entity.Player;

public abstract class ResourcePackManager {
    protected static ResourcePackManager instance;

    public enum ResourcePackStatus {
        GENERATING,
        GENERATED,
        READY,
        ERROR
    }

    public static ResourcePackManager getInstance() {
        return instance;
    }

    /**
     * Load models from disk.
     *
     * @throws Exception if failed to load models
     */
    public abstract void loadModelsFromDisk() throws Exception;

    /**
     * Generate the resource pack.
     *
     * @throws Exception if failed to generate the resource pack
     */
    public abstract void generateResourcePack() throws Exception;

    /**
     * Start a small http server to serve the resource pack.
     */
    public abstract void startServer() throws Exception;

    /**
     * Stop the http server.
     */
    public abstract void stopServer();

    /**
     * Apply the resource pack to all players.
     *
     * @throws IllegalStateException if the resource pack is not ready
     */
    public abstract void applyToAllPlayers() throws IllegalStateException;

    /**
     * Apply the resource pack to the player.
     *
     * @param player the player to apply the resource pack to
     * @throws IllegalStateException if the resource pack is not ready
     */
    public abstract void applyToPlayer(Player player) throws IllegalStateException;

    /**
     * Get the status of the resource pack.
     *
     * @return the status of the resource pack
     */
    public abstract ResourcePackStatus getStatus();

    /**
     * Check if the resource pack is ready.
     *
     * @return true if the resource pack is ready, false otherwise
     */
    public abstract boolean isReady();
}