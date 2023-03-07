package com.rabbitminers.extendedgears.base.data;

import com.rabbitminers.extendedgears.base.datatypes.IngredientProvider;
import com.rabbitminers.extendedgears.cogwheels.CustomCogwheelBlock;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ICogwheelMaterial {

    default <T extends Enum<T> & ICogwheelMaterial> BlockEntry<CustomCogwheelBlock> getCogwheel(boolean isLarge) {
        return isLarge ? getLargeCogwheel() : getSmallCogwheel();
    }

    @Nullable
    public BlockEntry<CustomCogwheelBlock> getLargeCogwheel();

    @Nullable
    public BlockEntry<CustomCogwheelBlock> getSmallCogwheel();

    @Nullable
    default TagKey<Item>[] getRecipeTags() {
        return null;
    }

    public @NotNull String asId();

    public IngredientProvider[] getIngredients();
}