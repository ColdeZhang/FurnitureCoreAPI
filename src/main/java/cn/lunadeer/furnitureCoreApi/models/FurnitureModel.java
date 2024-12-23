package cn.lunadeer.furnitureCoreApi.models;

import org.bukkit.NamespacedKey;

public interface FurnitureModel {
    NamespacedKey getItemModelKey();

    /**
     * Set the custom name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     *
     * @param customName the custom name of the model
     */
    void setCustomName(String customName);

    /**
     * Get the custom name of the model, generally used for display.
     * <p>
     * If not set in the json file, the custom name will be the name of the model file.
     */
    String getCustomName();

    /**
     * Get the name of the model, which is the name of the json file
     */
    String getModelName();

    /**
     * Get the name of the model in the format of path/name
     *
     * @return the name of the model
     */
    String getCallableNameNoNamespace();

    /**
     * Get the name of the model in the format of namespace:path/name
     *
     * @return the name of the model
     */
    String getCallableNameWithNamespace();

    /**
     * Register the recipe of the model
     */
    void registerRecipe();

    /**
     * Unregister the recipe of the model
     */
    void unregisterRecipe();
}
