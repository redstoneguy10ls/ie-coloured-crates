/*
package com.redstoneguy10ls.colouredie;

import blusunrize.immersiveengineering.common.crafting.fluidaware.TurnAndCopyRecipe;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

public class CopyNBTSerializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<CopyNBTRecipe> {

    @Nonnull
    @Override
    public CopyNBTRecipe fromJson(@Nonnull ResourceLocation recipeId, @Nonnull JsonObject json) {
        ShapelessRecipe basic = RecipeSerializer.SHAPELESS_RECIPE.fromJson(recipeId, json);
        CopyNBTRecipe recipe = new CopyNBTRecipe(recipeId, basic.getGroup(), basic.getIngredients(), basic.getResultItem());

        if(GsonHelper.isValidNode(json, "copy_nbt"))
        {
            if(GsonHelper.isArrayNode(json, "copy_nbt"))
            {
                JsonArray jArray = GsonHelper.getAsJsonArray(json, "copy_nbt");
                int[] array = new int[jArray.size()];
                for(int i = 0; i < array.length; i++)
                    array[i] = jArray.get(i).getAsInt();
                recipe.setNBTCopyTargetRecipe(array);
            }
            else
                recipe.setNBTCopyTargetRecipe(GsonHelper.getAsInt(json, "copy_nbt"));
            if(GsonHelper.isValidNode(json, "copy_nbt_predicate"))
                recipe.setNBTCopyPredicate(GsonHelper.getAsString(json, "copy_nbt_predicate"));
        }
        return recipe;
    }
    @Nonnull
    @Override
    public CopyNBTRecipe fromNetwork(@Nonnull ResourceLocation recipeId, @Nonnull FriendlyByteBuf buffer)
    {
        ShapelessRecipe basic = RecipeSerializer.SHAPELESS_RECIPE.fromNetwork(recipeId, buffer);
        CopyNBTRecipe recipe = new CopyNBTRecipe(recipeId, basic.getGroup(), basic.getIngredients(), basic.getResultItem());
        int[] array = buffer.readVarIntArray();
        if(array.length > 0)
        {
            recipe.setNBTCopyTargetRecipe(array);
            if(buffer.readBoolean())
                recipe.setNBTCopyPredicate(buffer.readUtf(512));

        }
        return recipe;

    }


    @Override
    public void toNetwork(@Nonnull FriendlyByteBuf buffer, @Nonnull CopyNBTRecipe recipe) {
        RecipeSerializer.SHAPELESS_RECIPE.toNetwork(buffer, recipe);
        int[] copying = recipe.getCopyTargets();
        if(copying==null)
            copying = new int[0];
        buffer.writeVarIntArray(copying);
        if(copying.length > 0)
        {
            if(recipe.hasCopyPredicate())
            {
                buffer.writeBoolean(true);
                buffer.writeUtf(recipe.getBufferPredicate());
            }
            else
                buffer.writeBoolean(false);
        }

    }

    @Override
    public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
        return null;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName() {
        return null;
    }

    @Override
    public Class<RecipeSerializer<?>> getRegistryType() {
        return null;
    }
}
*/