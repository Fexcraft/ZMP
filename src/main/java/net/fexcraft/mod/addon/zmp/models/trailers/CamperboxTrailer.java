//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.zmp.models.trailers;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/vehicle/camperbox_trailer")
public class CamperboxTrailer extends VehicleModel {

	public CamperboxTrailer(){
		super(); textureX = 256; textureY = 128;
		this.addToCreators("zackyboy18");
		this.addToCreators("Ferdinand (FEX___96)");
		//
		TurboList chassis_structure = new TurboList("chassis_structure");
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 243, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-46, 0.5f, -1).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 166, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -0.5f, -3).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 226, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-52, 2.5f, -4).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 86, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, 0, -3).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 101, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, 0, -4).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 125, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-53, 2, -3).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 240, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -1, -3).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 96, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-53, 0, 2).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 133, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -0.5f, -4).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 239, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 0, 3).setRotationAngle(0, 0, 0).setName("Box 9")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 64, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, 0, 5).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 128, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-50.5f, 0, 5).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 113, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-50.5f, 0, -18).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-49.5f, 0, -18).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 243, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 0, -6).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 0, textureX, textureY).addBox(0, 0, 0, 68, 2, 2)
			.setRotationPoint(-68, -2, -1.5f).setRotationAngle(0, 0, 0).setName("Box 0")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 8, textureX, textureY).addBox(0, 0, 0, 39, 1, 1)
			.setRotationPoint(-68, -1.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 5, textureX, textureY).addBox(0, 0, 0, 39, 1, 1)
			.setRotationPoint(-68, -1.7f, 13.5f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 222, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -1.7f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 47, 93, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -1.7f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 206, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -1.7f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 31, 91, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -1.7f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 163, 82, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -1.7f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 103, 80, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -1.7f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 91, textureX, textureY).addBox(0, 0, 0, 1, 1, 28)
			.setRotationPoint(-68, -1.7f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 9")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 81, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0)
			.setRotationPoint(-29, -1.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 10")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 81, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0)
			.setRotationPoint(-29, -1.7f, 13.5f).setRotationAngle(0, 0, 0).setName("Box 11")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 8, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-53.5f, -7.7f, -21.5f).setRotationAngle(0, 0, 0).setName("Box 12")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 105, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, -7.7f, -21.5f).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0)
			.setRotationPoint(-45.5f, -7.7f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 0, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-53.5f, -7.7f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 116, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0)
			.setRotationPoint(-59.5f, -7.7f, -21.5f).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 91, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0)
			.setRotationPoint(-59.5f, -7.7f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 86, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 7, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -1.5f, -4).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 111, 0, textureX, textureY).addBox(0, 0, 0, 39, 1, 30)
			.setRotationPoint(-68, -2.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 79, 32, textureX, textureY).addBox(0, 0, 0, 38, 6, 1)
			.setRotationPoint(-68, -8.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 27, textureX, textureY).addBox(0, 0, 0, 38, 6, 1)
			.setRotationPoint(-68, -8.7f, 13.5f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 173, 81, textureX, textureY).addBox(0, 0, 0, 1, 6, 30)
			.setRotationPoint(-30, -8.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 56, textureX, textureY).addBox(0, 0, 0, 2, 6, 28)
			.setRotationPoint(-68, -8.7f, -14.5f).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 82, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -24.7f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 91, 19, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-30, -26.7f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 232, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, -8, 0, 0, -8, 0, 0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 9)
			.setRotationPoint(-68, -23.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 200")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 111, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 2, 0, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0, -8, 0, 0, 8, 0, 0, 8, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -23.7f, 12.5f).setRotationAngle(0, 0, 0).setName("Box 201")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 38, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -24.7f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 16, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-30, -26.7f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 250, 13, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-68, -26.7f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 135, 13, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-68, -26.7f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 203, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 12, 0, 0, 0, 8, 0, 0, 8, 0, 0, -8, 0, 0, -8, 0, 0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -23.7f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 249, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, -8, 0, 0, -8, 0, 0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 8)
			.setRotationPoint(-31, -23.7f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 78, 80, textureX, textureY).addBox(0, 0, 0, 1, 1, 22)
			.setRotationPoint(-30, -27.7f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 138, 77, textureX, textureY).addBox(0, 0, 0, 1, 1, 22)
			.setRotationPoint(-68, -27.7f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 121, 77, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(-60, -27.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 214, 72, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(-38, -27.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 100, 60, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(-45, -27.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 33, 56, textureX, textureY).addBox(0, 0, 0, 1, 1, 18)
			.setRotationPoint(-52, -27.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 91, 11, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-30, -29.7f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 8, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-30, -29.7f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 223")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 135, 8, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-68, -29.7f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 220, 0, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-68, -29.7f, -12.5f).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 35, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-67, -27.7f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 158, 32, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-67, -27.7f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 61, 60, textureX, textureY).addBox(0, 0, 0, 1, 14, 18)
			.setRotationPoint(-29, -15.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 235, 32, textureX, textureY).addBox(0, 0, 0, 5, 12, 1)
			.setRotationPoint(-28, -14.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 11, textureX, textureY).addBox(0, 0, 0, 5, 12, 1)
			.setRotationPoint(-28, -14.7f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 104, 40, textureX, textureY).addBox(0, 0, 0, 5, 1, 18)
			.setRotationPoint(-28, -2.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 57, 40, textureX, textureY).addBox(0, 0, 0, 5, 1, 18)
			.setRotationPoint(-28, -15.7f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 166, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 12, 16, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0)
			.setRotationPoint(-23, -14.7f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 15, 2, 0, -1, -1, -9, -1, -1, -9, 0, 0, 8, 0, 0, 8, -1, 0, -2, -1, 0, -2, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-66, -23.7f, -17.5f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 158, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 15, 2, 0, 0, 0, 8, 0, 0, 8, -1, -1, -9, -1, -1, -9, 0, 0, 1, 0, 0, 1, -1, 0, -2, -1, 0, -2)
			.setRotationPoint(-66, -23.7f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 141, 51, textureX, textureY).addBox(0, 0, 0, 2, 15, 10)
			.setRotationPoint(-68, -23.7f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 110, 11, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-22.5f, -9.7f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 132, 5, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-51, -10.7f, -15).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 243, 3, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-51, -10.7f, 13).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-69, -3, -6).setRotationAngle(0, 0, 0)
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 239, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.5f, 0, 0, 0, 0, 0, 1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 1, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-68, -3, 14).setRotationAngle(0, 0, 0)
		);
		chassis_structure.add(new ModelRendererTurbo(chassis_structure, 187, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -1.5f, 0, 0, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-68, -3, -21).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis_structure);
		//
		TurboList indicator_left = new TurboList("indicator_left");
		indicator_left.add(new ModelRendererTurbo(indicator_left, 248, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-67.5f, -2.5f, 17.5f).setRotationAngle(0, 0, 0)
		);
		indicator_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(indicator_left);
		//
		TurboList indicator_right = new TurboList("indicator_right");
		indicator_right.add(new ModelRendererTurbo(indicator_right, 133, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-67.5f, -2.5f, -20.5f).setRotationAngle(0, 0, 0)
		);
		indicator_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(indicator_right);
		//
		TurboList rear_lights = new TurboList("rear_lights");
		rear_lights.add(new ModelRendererTurbo(rear_lights, 133, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-68, -2.5f, 15).setRotationAngle(0, 0, 0)
		);
		rear_lights.add(new ModelRendererTurbo(rear_lights, 104, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-68, -2.5f, -18).setRotationAngle(0, 0, 0)
		);
		rear_lights.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(rear_lights);
	}

}
