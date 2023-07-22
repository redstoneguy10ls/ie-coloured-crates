/*
package com.redstoneguy10ls.colouredie;

import blusunrize.immersiveengineering.common.crafting.fluidaware.AbstractShapedRecipe;
import blusunrize.immersiveengineering.common.crafting.fluidaware.TurnAndCopyRecipe;
import blusunrize.immersiveengineering.common.util.ItemNBTHelper;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.regex.Pattern;

public class CopyNBTRecipe implements Recipe<SimpleContainer> {

    private final ItemStack output;
    private final ResourceLocation id;
    private final String group;
    private final NonNullList<Ingredient> ingr;
    protected int[] nbtCopyTargetSlot = null;
    protected Pattern nbtCopyPredicate = null;

    public CopyNBTRecipe(ResourceLocation id, String group, NonNullList<Ingredient> ingr,
                         ItemStack output)
    {
        super();
        this.ingr = ingr;
        this.group = group;
        this.id = id;
        this.output = output;
    }

    @Nullable
    @Override
    protected TurnAndCopyRecipe.MatchLocation findMatch(CraftingContainer craftingContainer) {
        return null;
    }

    public void setNBTCopyTargetRecipe(int... slot)
    {
        this.nbtCopyTargetSlot = slot;
    }
    public void setNBTCopyPredicate(String pattern)
    {
        this.nbtCopyPredicate = Pattern.compile(pattern);
    }

    @Nonnull
    @Override
    public ItemStack assemble(@Nonnull CraftingContainer matrix)
    {
        if(nbtCopyTargetSlot!=null)
        {
            ItemStack out = getResultItem().copy();
            CompoundTag tag = out.getOrCreateTag();
            for(int targetSlot : nbtCopyTargetSlot)
            {
                ItemStack s = matrix.getItem(targetSlot);
                if(!s.isEmpty()&&s.hasTag())
                    tag = ItemNBTHelper.combineTags(tag, s.getOrCreateTag(), nbtCopyPredicate);
            }
            out.setTag(tag);
            return out;
        }
        else
            return super.assemble(matrix);
    }

    public int[] getCopyTargets()
    {
        return nbtCopyTargetSlot;
    }

    public boolean hasCopyPredicate()
    {
        return nbtCopyPredicate!=null;
    }

    public String getBufferPredicate()
    {
        return nbtCopyPredicate.pattern();
    }


    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        return false;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return null;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return false;
    }

    @Override
    public ItemStack getResultItem() {
        return null;
    }

    @Override
    public ResourceLocation getId() {
        return null;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return null;
    }
}
*/