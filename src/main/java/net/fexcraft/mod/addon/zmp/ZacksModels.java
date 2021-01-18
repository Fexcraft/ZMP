package net.fexcraft.mod.addon.zmp;

import net.fexcraft.mod.fvtm.data.addon.AddonClass;
import net.minecraftforge.fml.common.Mod;

@AddonClass(registryname = "fvtm:zmp")
@Mod(modid = ZacksModels.MODID, name = ZacksModels.NAME, version = ZacksModels.VERSION, useMetadata = true, dependencies = "required-after:fcl;required-after:fvtm")
public class ZacksModels {
	
    public static final String MODID = "zmp";
    public static final String NAME = "\"Zack's Model Projects\"";
    public static final String VERSION = "1.0";
    
}
