//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.zmp.models.wheels;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/part/trailer_wheel")
public class TrailerWheel extends PartModel {

	public TrailerWheel(){
		super(); textureX = 64; textureY = 64;
		this.addToCreators("zackyboy18");
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList wheel = new TurboList("wheel");
		wheel.add(new ModelRendererTurbo(wheel, 8, 32, textureX, textureY)
			.addShapeBox(-0.5f, -1.5f, -1.5f, 2, 3, 2, 0, -0.5f, 0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(0, 0, 2.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 32, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 22.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 67.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 45).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 157.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 135).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 112.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 90).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 27, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 337.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 315).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 292.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 270).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 247.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 225).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 202.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 22, textureX, textureY)
			.addShapeBox(-1, -6, -1.5f, 2, 3, 2, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.05f, -0.7f, 0, 0.05f, -0.7f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0, -0.35f, -0.2f, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 180).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 22, textureX, textureY)
			.addShapeBox(-1.5f, -1.5f, -1.5f, 2, 3, 2, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, -0.75f, 0)
			.setRotationPoint(0, 0, 2.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 22.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 67.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 45).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 157.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 135).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 112.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 19, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 90).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 337.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 315).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 292.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 270).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 247.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 225).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 202.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 16, textureX, textureY)
			.addShapeBox(-1, -3, -1.5f, 2, 1, 2, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.35f, 0.2f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, 0, -0.525f, -0.4f, -0.6f, -0.525f, -0.4f, -0.6f)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 180).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 22.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 67.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 45).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 157.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 135).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 112.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 8, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 90).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 56, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 337.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 48, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 315).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 40, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 292.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 32, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 270).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 24, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 247.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 16, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 225).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 8, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 202.5f).setName("Box 506")
		);
		wheel.add(new ModelRendererTurbo(wheel, 0, 0, textureX, textureY)
			.addShapeBox(-1, -6, -3.5f, 2, 6, 2, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0.2f, 0, 0, 0.2f, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(0, 0, 3.5f).setRotationAngle(0, 0, 180).setName("Box 506")
		);
		wheel.addProgram(DefaultPrograms.WHEEL_AUTO_ALL);
		this.groups.add(wheel);
	}

}
