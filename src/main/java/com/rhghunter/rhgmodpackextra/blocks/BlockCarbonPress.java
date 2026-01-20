package com.rhghunter.rhgmodpackextra.blocks;

import com.rhghunter.rhgmodpackextra.RHGModpackExtra;
import com.rhghunter.rhgmodpackextra.tiles.TileCarbonPress;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCarbonPress extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon iconFront, iconTop, iconBottom, iconSide;
}
