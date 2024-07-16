package dev.auxves.disco

import net.fabricmc.loader.api.FabricLoader
import net.minecraft.util.registry.Registry

fun init() {
	val addons = FabricLoader.getInstance().allMods
		.filter { it.metadata.customValues.containsKey("disco") }
		.map { it.metadata.toAddon() }

	val discs = addons.flatMap { it.discs }

	discs.forEach {
		Registry.register(Registry.ITEM, it.id, it)
	}
}