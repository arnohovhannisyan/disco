package dev.auxves.disco

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.MusicDiscItem
import net.minecraft.sound.SoundEvent
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Identifier
import net.minecraft.util.Rarity

private val settings = Item.Settings()
	.rarity(Rarity.RARE)
	.group(ItemGroup.TOOLS)
	.maxCount(1)

class Disc(val id: Identifier, duration: Int) : MusicDiscItem(15, SoundEvent(id), settings) {
	override fun getName(stack: ItemStack?): Text {
		return TranslatableText("item.minecraft.music_disc_cat")
	}
}
