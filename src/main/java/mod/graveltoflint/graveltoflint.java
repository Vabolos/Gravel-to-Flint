package mod.graveltoflint;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class graveltoflint extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("FlintFromGravel has been enabled!");

        // Register the custom recipe
        addFlintRecipe();
    }

    @Override
    public void onDisable() {
        getLogger().info("FlintFromGravel has been disabled.");
    }

    private void addFlintRecipe() {
        // Create a new NamespacedKey for the recipe
        NamespacedKey key = new NamespacedKey(this, "flint_from_gravel");

        // Define the resulting item (1 Flint)
        ItemStack flint = new ItemStack(Material.FLINT, 1);

        // Create the shaped recipe
        ShapedRecipe recipe = new ShapedRecipe(key, flint);
        recipe.shape(" G ", " G ", " G ");
        recipe.setIngredient('G', Material.GRAVEL);

        // Add the recipe to the server
        Bukkit.addRecipe(recipe);
    }
}

