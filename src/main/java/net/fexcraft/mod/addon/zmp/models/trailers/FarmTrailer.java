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
@fModel(registryname = "zmp:models/vehicle/farm_trailer")
public class FarmTrailer extends VehicleModel {

	public FarmTrailer(){
		super(); textureX = 512; textureY = 128;
		//
		TurboList body = new TurboList("body");
		body.add(new ModelRendererTurbo(body, 1, 1, textureX, textureY).addBox(0, 0, 0, 100, 2, 2)
			.setRotationPoint(-99, -1, -1).setRotationAngle(0, 0, -0).setName("Box 0")
		);
		body.add(new ModelRendererTurbo(body, 209, 1, textureX, textureY).addBox(0, 0, 0, 70, 2, 1)
			.setRotationPoint(-99, -0.7f, -15).setRotationAngle(0, 0, -0).setName("Box 1")
		);
		body.add(new ModelRendererTurbo(body, 353, 1, textureX, textureY).addBox(0, 0, 0, 70, 2, 1)
			.setRotationPoint(-99, -0.7f, 14).setRotationAngle(0, 0, -0).setName("Box 2")
		);
		body.add(new ModelRendererTurbo(body, 193, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -0.7f, 1).setRotationAngle(0, 0, -0).setName("Box 3")
		);
		body.add(new ModelRendererTurbo(body, 1, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -0.7f, 1).setRotationAngle(0, 0, -0).setName("Box 4")
		);
		body.add(new ModelRendererTurbo(body, 33, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -0.7f, 1).setRotationAngle(0, 0, -0).setName("Box 5")
		);
		body.add(new ModelRendererTurbo(body, 65, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -0.7f, -14).setRotationAngle(0, 0, -0).setName("Box 6")
		);
		body.add(new ModelRendererTurbo(body, 97, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -0.7f, -14).setRotationAngle(0, 0, -0).setName("Box 7")
		);
		body.add(new ModelRendererTurbo(body, 129, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -0.7f, -14).setRotationAngle(0, 0, -0).setName("Box 8")
		);
		body.add(new ModelRendererTurbo(body, 129, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 30)
			.setRotationPoint(-100, -0.7f, -15).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		body.add(new ModelRendererTurbo(body, 209, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0)
			.setRotationPoint(-29, -0.7f, -15).setRotationAngle(0, 0, -0).setName("Box 10")
		);
		body.add(new ModelRendererTurbo(body, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0)
			.setRotationPoint(-29, -0.7f, 14).setRotationAngle(0, 0, -0).setName("Box 11")
		);
		body.add(new ModelRendererTurbo(body, 17, 9, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-85.5f, -5.2f, -21).setRotationAngle(0, 0, -0).setName("Box 12")
		);
		body.add(new ModelRendererTurbo(body, 49, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0)
			.setRotationPoint(-77.5f, -5.2f, -21).setRotationAngle(0, 0, -0).setName("Box 13")
		);
		body.add(new ModelRendererTurbo(body, 81, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0)
			.setRotationPoint(-78, -5.2f, 15).setRotationAngle(0, 0, -0).setName("Box 14")
		);
		body.add(new ModelRendererTurbo(body, 113, 9, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-86, -5.2f, 15).setRotationAngle(0, 0, -0).setName("Box 15")
		);
		body.add(new ModelRendererTurbo(body, 321, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0)
			.setRotationPoint(-91.5f, -5.2f, -21).setRotationAngle(0, 0, -0).setName("Box 16")
		);
		body.add(new ModelRendererTurbo(body, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0)
			.setRotationPoint(-92, -5.2f, 15).setRotationAngle(0, 0, -0).setName("Box 17")
		);
		body.add(new ModelRendererTurbo(body, 169, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-72, -0.7f, -14).setRotationAngle(0, 0, -0).setName("Box 18")
		);
		body.add(new ModelRendererTurbo(body, 337, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-72, -0.7f, 1).setRotationAngle(0, 0, -0).setName("Box 19")
		);
		body.add(new ModelRendererTurbo(body, 369, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-86, -0.7f, -14).setRotationAngle(0, 0, -0).setName("Box 20")
		);
		body.add(new ModelRendererTurbo(body, 401, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-86, -0.7f, 1).setRotationAngle(0, 0, -0).setName("Box 21")
		);
		body.add(new ModelRendererTurbo(body, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-80, 0.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 299")
		);
		body.add(new ModelRendererTurbo(body, 385, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-83, 3.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 300")
		);
		body.add(new ModelRendererTurbo(body, 417, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-83, 0.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 8")
		);
		body.add(new ModelRendererTurbo(body, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5f, 1, 3.5f).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		body.add(new ModelRendererTurbo(body, 433, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-81.5f, 1, 5.5f).setRotationAngle(0, 0, -0).setName("Box 173")
		);
		body.add(new ModelRendererTurbo(body, 465, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-82.5f, 1, 5.5f).setRotationAngle(0, 0, -0).setName("Box 175")
		);
		body.add(new ModelRendererTurbo(body, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-82.5f, 1, -19.5f).setRotationAngle(0, 0, -0).setName("Box 176")
		);
		body.add(new ModelRendererTurbo(body, 217, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-81.5f, 1, -19.5f).setRotationAngle(0, 0, -0).setName("Box 178")
		);
		body.add(new ModelRendererTurbo(body, 145, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-82.5f, 1, -5.5f).setRotationAngle(0, 0, -0).setName("Box 16")
		);
		body.add(new ModelRendererTurbo(body, 457, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-83, -1.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 18")
		);
		body.add(new ModelRendererTurbo(body, 241, 17, textureX, textureY).addBox(0, 0, 0, 14, 1, 1)
			.setRotationPoint(-88.5f, -2.2f, -16).setRotationAngle(0, 0, -0).setName("Box 33")
		);
		body.add(new ModelRendererTurbo(body, 17, 17, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-87.5f, -3.2f, -16).setRotationAngle(0, 0, -0).setName("Box 34")
		);
		body.add(new ModelRendererTurbo(body, 49, 17, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-88, -3.2f, 15).setRotationAngle(0, 0, -0).setName("Box 35")
		);
		body.add(new ModelRendererTurbo(body, 273, 17, textureX, textureY).addBox(0, 0, 0, 14, 1, 1)
			.setRotationPoint(-89, -2.2f, 15).setRotationAngle(0, 0, -0).setName("Box 36")
		);
		body.add(new ModelRendererTurbo(body, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(-87.25f, -1.25f, 14.75f).setRotationAngle(0, 0, -0).setName("Box 37")
		);
		body.add(new ModelRendererTurbo(body, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0)
			.setRotationPoint(-76.75f, -1.25f, 14.75f).setRotationAngle(0, 0, -0).setName("Box 38")
		);
		body.add(new ModelRendererTurbo(body, 17, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(-87.25f, -1.25f, -16).setRotationAngle(0, 0, -0).setName("Box 39")
		);
		body.add(new ModelRendererTurbo(body, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0)
			.setRotationPoint(-76.5f, -1.25f, -16).setRotationAngle(0, 0, -0).setName("Box 40")
		);
		body.add(new ModelRendererTurbo(body, 1, 49, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(-86.5f, -4.2f, -16).setRotationAngle(0, 0, -0).setName("Box 191")
		);
		body.add(new ModelRendererTurbo(body, 25, 49, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(-87, -4.2f, 15).setRotationAngle(0, 0, -0).setName("Box 192")
		);
		body.add(new ModelRendererTurbo(body, 41, 49, textureX, textureY).addBox(0, 0, 0, 69, 1, 13)
			.setRotationPoint(-99, -1, -14).setRotationAngle(0, 0, -0).setName("Box 179")
		);
		body.add(new ModelRendererTurbo(body, 193, 57, textureX, textureY).addBox(0, 0, 0, 69, 1, 13)
			.setRotationPoint(-99, -1, 1).setRotationAngle(0, 0, -0).setName("Box 180")
		);
		body.add(new ModelRendererTurbo(body, 81, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-64, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 187")
		);
		body.add(new ModelRendererTurbo(body, 105, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-76, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 188")
		);
		body.add(new ModelRendererTurbo(body, 113, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-88, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 190")
		);
		body.add(new ModelRendererTurbo(body, 137, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-52, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 193")
		);
		body.add(new ModelRendererTurbo(body, 321, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-41, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 196")
		);
		body.add(new ModelRendererTurbo(body, 457, 9, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-100, -5.7f, 14).setRotationAngle(0, 0, -0).setName("Box 197")
		);
		body.add(new ModelRendererTurbo(body, 345, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-88, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 199")
		);
		body.add(new ModelRendererTurbo(body, 353, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-76, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 201")
		);
		body.add(new ModelRendererTurbo(body, 377, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-64, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 203")
		);
		body.add(new ModelRendererTurbo(body, 473, 9, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-52, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 205")
		);
		body.add(new ModelRendererTurbo(body, 225, 17, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-41, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 207")
		);
		body.add(new ModelRendererTurbo(body, 505, 17, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-100, -5.7f, -15).setRotationAngle(0, 0, -0).setName("Box 209")
		);
		body.add(new ModelRendererTurbo(body, 345, 57, textureX, textureY).addBox(0, 0, 0, 70, 1, 1)
			.setRotationPoint(-99, -5.7f, 14).setRotationAngle(0, 0, -0).setName("Box 210")
		);
		body.add(new ModelRendererTurbo(body, 441, 17, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-30, -4.7f, 14).setRotationAngle(0, 0, -0).setName("Box 211")
		);
		body.add(new ModelRendererTurbo(body, 1, 65, textureX, textureY).addBox(0, 0, 0, 70, 1, 1)
			.setRotationPoint(-99, -5.7f, -15).setRotationAngle(0, 0, -0).setName("Box 212")
		);
		body.add(new ModelRendererTurbo(body, 225, 25, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-30, -4.7f, -15).setRotationAngle(0, 0, -0).setName("Box 213")
		);
		body.add(new ModelRendererTurbo(body, 505, 33, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-30, -4.7f, -4).setRotationAngle(0, 0, -0).setName("Box 214")
		);
		body.add(new ModelRendererTurbo(body, 497, 41, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-30, -4.7f, 3).setRotationAngle(0, 0, -0).setName("Box 215")
		);
		body.add(new ModelRendererTurbo(body, 121, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 28)
			.setRotationPoint(-30, -5.7f, -14).setRotationAngle(0, 0, -0).setName("Box 216")
		);
		body.add(new ModelRendererTurbo(body, 505, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, -13).setRotationAngle(0, 0, -0).setName("Box 218")
		);
		body.add(new ModelRendererTurbo(body, 489, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, -8).setRotationAngle(0, 0, -0).setName("Box 219")
		);
		body.add(new ModelRendererTurbo(body, 153, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 26)
			.setRotationPoint(-101, -23.7f, -13).setRotationAngle(0, 0, -0).setName("Box 223")
		);
		body.add(new ModelRendererTurbo(body, 337, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 26)
			.setRotationPoint(-100, -1.7f, -13).setRotationAngle(0, 0, -0).setName("Box 224")
		);
		body.add(new ModelRendererTurbo(body, 497, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, 7).setRotationAngle(0, 0, -0).setName("Box 225")
		);
		body.add(new ModelRendererTurbo(body, 153, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, 12).setRotationAngle(0, 0, -0).setName("Box 226")
		);
		body.add(new ModelRendererTurbo(body, 161, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, 2).setRotationAngle(0, 0, -0).setName("Box 227")
		);
		body.add(new ModelRendererTurbo(body, 169, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 21, 1, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -22.7f, -3).setRotationAngle(0, 0, -0).setName("Box 228")
		);
		body.add(new ModelRendererTurbo(body, 185, 65, textureX, textureY).addBox(0, 0, 0, 1, 21, 1)
			.setRotationPoint(-50, -21.7f, 14.25f).setRotationAngle(0, 0, -0).setName("Box 229")
		);
		body.add(new ModelRendererTurbo(body, 369, 65, textureX, textureY).addBox(0, 0, 0, 1, 21, 1)
			.setRotationPoint(-50, -21.7f, -15.25f).setRotationAngle(0, 0, -0).setName("Box 230")
		);
		body.add(new ModelRendererTurbo(body, 377, 65, textureX, textureY).addBox(0, 0, 0, 1, 21, 1)
			.setRotationPoint(-81, -21.7f, -15.25f).setRotationAngle(0, 0, -0).setName("Box 231")
		);
		body.add(new ModelRendererTurbo(body, 385, 65, textureX, textureY).addBox(0, 0, 0, 1, 21, 1)
			.setRotationPoint(-81, -21.7f, 14.25f).setRotationAngle(0, 0, -0).setName("Box 232")
		);
		body.add(new ModelRendererTurbo(body, 49, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-81, -25.7f, -15.25f).setRotationAngle(0, 0, -0).setName("Box 233")
		);
		body.add(new ModelRendererTurbo(body, 193, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -25.7f, -15.25f).setRotationAngle(0, 0, -0).setName("Box 234")
		);
		body.add(new ModelRendererTurbo(body, 201, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-81, -25.7f, 14.25f).setRotationAngle(0, 0, -0).setName("Box 235")
		);
		body.add(new ModelRendererTurbo(body, 209, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -25.7f, 14.25f).setRotationAngle(0, 0, -0).setName("Box 236")
		);
		body.add(new ModelRendererTurbo(body, 369, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 28)
			.setRotationPoint(-81, -26.7f, -14).setRotationAngle(0, 0, -0).setName("Box 237")
		);
		body.add(new ModelRendererTurbo(body, 433, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 28)
			.setRotationPoint(-50, -26.7f, -14).setRotationAngle(0, 0, -0).setName("Box 238")
		);
		this.groups.add(body);
		//
		TurboList indicator_left = new TurboList("indicator_left");
		indicator_left.add(new ModelRendererTurbo(indicator_left, 49, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-100.5f, -0.2f, 11).setRotationAngle(0, 0, -0).setName("Box 145")
		);
		indicator_left.addProgram(DefaultPrograms.INDICATOR_LIGHT_LEFT);
		this.groups.add(indicator_left);
		//
		TurboList indicator_right = new TurboList("indicator_right");
		indicator_right.add(new ModelRendererTurbo(indicator_right, 73, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-100.5f, -0.2f, -12).setRotationAngle(0, 0, -0).setName("Box 146")
		);
		indicator_right.addProgram(DefaultPrograms.INDICATOR_LIGHT_RIGHT);
		this.groups.add(indicator_right);
		//
		TurboList rear_lights = new TurboList("rear_lights");
		rear_lights.add(new ModelRendererTurbo(rear_lights, 385, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-100.5f, -0.2f, -14).setRotationAngle(0, 0, -0).setName("Box 143")
		);
		rear_lights.add(new ModelRendererTurbo(rear_lights, 417, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-100.5f, -0.2f, 12).setRotationAngle(0, 0, -0).setName("Box 144")
		);
		rear_lights.addProgram(DefaultPrograms.REAR_LIGHTS);
		this.groups.add(rear_lights);
	}

}
