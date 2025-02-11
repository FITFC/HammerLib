package org.zeith.hammerlib.core.adapter.recipe;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.crafting.*;
import org.zeith.hammerlib.core.RecipeHelper;
import org.zeith.hammerlib.util.mcf.itf.IRecipeRegistrationEvent;

public class ShapelessRecipeBuilder
		extends RecipeBuilder<ShapelessRecipeBuilder, Recipe<?>>
{
	private final NonNullList<Ingredient> ingredients = NonNullList.create();
	
	public ShapelessRecipeBuilder(IRecipeRegistrationEvent<Recipe<?>> event)
	{
		super(event);
	}
	
	public ShapelessRecipeBuilder add(Object ingredient)
	{
		this.ingredients.add(RecipeHelper.fromComponent(ingredient));
		return this;
	}
	
	public ShapelessRecipeBuilder addAll(Object... ingredients)
	{
		for(Object ingredient : ingredients) this.ingredients.add(RecipeHelper.fromComponent(ingredient));
		return this;
	}
	
	public ShapelessRecipeBuilder addAll(Iterable<Object> ingredients)
	{
		for(Object ingredient : ingredients) this.ingredients.add(RecipeHelper.fromComponent(ingredient));
		return this;
	}
	
	@Override
	public void register()
	{
		validate();
		if(ingredients.isEmpty())
			throw new IllegalStateException(getClass().getSimpleName() + " does not have any defined ingredients!");
		var id = getIdentifier();
		event.register(id, new ShapelessRecipe(id, group, result, ingredients));
	}
}