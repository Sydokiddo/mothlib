package net.sydokiddo.mothlib.tags;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MothLibTags {

    // Item Tags

    // Block Tags

    public static final TagKey<Block> NETHER_PORTAL_ACTIVATING_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("mothlib", "nether_portal_activating_blocks"));
    public static final TagKey<Block> CONDUIT_ACTIVATING_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("mothlib", "conduit_activating_blocks"));
    public static final TagKey<Block> END_CRYSTAL_BASE_BLOCKS = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("mothlib", "end_crystal_base_blocks"));

    // Entity Tags

    // Game Event Tags
}
