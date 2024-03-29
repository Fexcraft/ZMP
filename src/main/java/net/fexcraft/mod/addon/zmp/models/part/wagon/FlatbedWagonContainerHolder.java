//FMT-Marker FVTM-1
package net.fexcraft.mod.addon.zmp.models.part.wagon;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.PartModel;
import net.fexcraft.mod.fvtm.model.ModelGroup;

/** This file was exported via the FVTM Exporter V1 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.0.5-test &copy; 2018 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/part/flatbedwagon_containerholder")
public class FlatbedWagonContainerHolder extends PartModel {

	public FlatbedWagonContainerHolder(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("zackyboy19");
		//
		ModelGroup container_holder = new ModelGroup("container_holder");
		container_holder.add(new ModelRendererTurbo(container_holder, 389, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 50, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(112, -33, -25).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		container_holder.add(new ModelRendererTurbo(container_holder, 332, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 50, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0)
			.setRotationPoint(-115, -33, -25).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		this.groups.add(container_holder);
		this.translate(0, 6, 0);
	}

}
