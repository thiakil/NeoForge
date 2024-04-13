package net.neoforged.neoforge.annotations;

import net.minecraft.world.level.block.Block;
import org.intellij.lang.annotations.MagicConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MagicConstant(flags = {
        Block.UPDATE_NEIGHBORS,
        Block.UPDATE_CLIENTS,
        Block.UPDATE_INVISIBLE,
        Block.UPDATE_IMMEDIATE,
        Block.UPDATE_KNOWN_SHAPE,
        Block.UPDATE_SUPPRESS_DROPS,
        Block.UPDATE_MOVE_BY_PISTON,
        Block.UPDATE_NONE,
        Block.UPDATE_ALL,
        Block.UPDATE_ALL_IMMEDIATE,
})
@Target(value = {ElementType.PARAMETER, ElementType.TYPE_USE})
public @interface BlockFlags {
}
