//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.zmp.models.trailers;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/vehicle/utility_trailer")
public class UtilityTrailer extends VehicleModel {

	public UtilityTrailer(){
		super(); textureX = 512; textureY = 128;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY).addBox(0, 0, 0, 100, 2, 2)
			.setRotationPoint(-99, -2, -1).setRotationAngle(0, 0, -0).setName("Box 0")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 1, textureX, textureY).addBox(0, 0, 0, 70, 2, 1)
			.setRotationPoint(-99, -1.7f, -15).setRotationAngle(0, 0, -0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 1, textureX, textureY).addBox(0, 0, 0, 70, 2, 1)
			.setRotationPoint(-99, -1.7f, 14).setRotationAngle(0, 0, -0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -1.7f, 1).setRotationAngle(0, 0, -0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -1.7f, 1).setRotationAngle(0, 0, -0).setName("Box 4")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -1.7f, 1).setRotationAngle(0, 0, -0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-30, -1.7f, -14).setRotationAngle(0, 0, -0).setName("Box 6")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-43, -1.7f, -14).setRotationAngle(0, 0, -0).setName("Box 7")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-56, -1.7f, -14).setRotationAngle(0, 0, -0).setName("Box 8")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 30)
			.setRotationPoint(-100, -1.7f, -15).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, -14, 0, 0, 14, 0, 0, 0)
			.setRotationPoint(-29, -1.7f, -15).setRotationAngle(0, 0, -0).setName("Box 10")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 2, 1, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, -14, 0, 0, 0)
			.setRotationPoint(-29, -1.7f, 14).setRotationAngle(0, 0, -0).setName("Box 11")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 9, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-81, -5.7f, -21).setRotationAngle(0, 0, -0).setName("Box 12")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0)
			.setRotationPoint(-73, -5.7f, -21).setRotationAngle(0, 0, -0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0)
			.setRotationPoint(-73, -5.7f, 15).setRotationAngle(0, 0, -0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 9, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
			.setRotationPoint(-81, -5.7f, 15).setRotationAngle(0, 0, -0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0)
			.setRotationPoint(-87, -5.7f, -21).setRotationAngle(0, 0, -0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 6, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0)
			.setRotationPoint(-87, -5.7f, 15).setRotationAngle(0, 0, -0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-72, -1.7f, -14).setRotationAngle(0, 0, -0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-72, -1.7f, 1).setRotationAngle(0, 0, -0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-86, -1.7f, -14).setRotationAngle(0, 0, -0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 13)
			.setRotationPoint(-86, -1.7f, 1).setRotationAngle(0, 0, -0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 17, textureX, textureY).addBox(0, 0, 0, 14, 1, 1)
			.setRotationPoint(-84, -2.7f, -16).setRotationAngle(0, 0, -0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 17, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-83, -3.7f, -16).setRotationAngle(0, 0, -0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 17, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-83, -3.7f, 15).setRotationAngle(0, 0, -0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 17, textureX, textureY).addBox(0, 0, 0, 14, 1, 1)
			.setRotationPoint(-84, -2.7f, 15).setRotationAngle(0, 0, -0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(-82.5f, -1, 13).setRotationAngle(0, 0, -0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0)
			.setRotationPoint(-71.5f, -1, 13).setRotationAngle(0, 0, -0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(-82.5f, -1, -14).setRotationAngle(0, 0, -0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0)
			.setRotationPoint(-71.5f, -1, -14).setRotationAngle(0, 0, -0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 49, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(-82, -4.7f, -16).setRotationAngle(0, 0, -0).setName("Box 191")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 49, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(-82, -4.7f, 15).setRotationAngle(0, 0, -0).setName("Box 192")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 57, textureX, textureY).addBox(0, 0, 0, 69, 1, 13)
			.setRotationPoint(-99, -2, -14).setRotationAngle(0, 0, -0).setName("Box 179")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 65, textureX, textureY).addBox(0, 0, 0, 69, 1, 13)
			.setRotationPoint(-99, -2, 1).setRotationAngle(0, 0, -0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-100, -21.7f, -15).setRotationAngle(0, 0, -0).setName("Box 185")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-62, -21.7f, -15).setRotationAngle(0, 0, -0).setName("Box 186")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-62, -21.7f, 14).setRotationAngle(0, 0, -0).setName("Box 187")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-100, -21.7f, 14).setRotationAngle(0, 0, -0).setName("Box 188")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-30, -21.7f, 14).setRotationAngle(0, 0, -0).setName("Box 189")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 49, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-30, -21.7f, -15).setRotationAngle(0, 0, -0).setName("Box 190")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 65, textureX, textureY).addBox(0, 0, 0, 1, 1, 30)
			.setRotationPoint(-62, -22.7f, -15).setRotationAngle(0, 0, -0).setName("Box 197")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 30)
			.setRotationPoint(-100, -22.7f, -15).setRotationAngle(0, 0, -0).setName("Box 198")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-100, -24.7f, -14).setRotationAngle(0, 0, -0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-100, -24.7f, 13).setRotationAngle(0, 0, -0).setName("Box 200")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-62, -24.7f, 13).setRotationAngle(0, 0, -0).setName("Box 201")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 9, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-62, -24.7f, -14).setRotationAngle(0, 0, -0).setName("Box 202")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 30)
			.setRotationPoint(-30, -22.7f, -15).setRotationAngle(0, 0, -0).setName("Box 203")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-30, -23.7f, -14).setRotationAngle(0, 0, -0).setName("Box 204")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-30, -23.7f, 13).setRotationAngle(0, 0, -0).setName("Box 205")
		);
		this.groups.add(group0);
		//
		TurboList axle = new TurboList("axle");
		axle.add(new ModelRendererTurbo(axle, 497, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-75, 0.5f, -2.5f).setRotationAngle(0, 0, -0).setName("Box 299")
		);
		axle.add(new ModelRendererTurbo(axle, 385, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-78, 3.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 300")
		);
		axle.add(new ModelRendererTurbo(axle, 417, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-78, 0.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 8")
		);
		axle.add(new ModelRendererTurbo(axle, 1, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.5f, 1, 3.5f).setRotationAngle(0, 0, -0).setName("Box 9")
		);
		axle.add(new ModelRendererTurbo(axle, 433, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-76.5f, 1, 5.5f).setRotationAngle(0, 0, -0).setName("Box 173")
		);
		axle.add(new ModelRendererTurbo(axle, 465, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-77.5f, 1, 5.5f).setRotationAngle(0, 0, -0).setName("Box 175")
		);
		axle.add(new ModelRendererTurbo(axle, 185, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-77.5f, 1, -19.5f).setRotationAngle(0, 0, -0).setName("Box 176")
		);
		axle.add(new ModelRendererTurbo(axle, 217, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-76.5f, 1, -19.5f).setRotationAngle(0, 0, -0).setName("Box 178")
		);
		axle.add(new ModelRendererTurbo(axle, 145, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-77.5f, 1, -5.5f).setRotationAngle(0, 0, -0).setName("Box 16")
		);
		axle.add(new ModelRendererTurbo(axle, 457, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-78, -0.5f, -3.5f).setRotationAngle(0, 0, -0).setName("Box 18")
		);
		this.groups.add(axle);
		//
		TurboList lights_rear = new TurboList("lights_rear");
		lights_rear.add(new ModelRendererTurbo(lights_rear, 385, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-100.5f, -1.2f, -14).setRotationAngle(0, 0, -0).setName("Box 143")
		);
		lights_rear.add(new ModelRendererTurbo(lights_rear, 417, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-100.5f, -1.2f, 12).setRotationAngle(0, 0, -0).setName("Box 144")
		);
		lights_rear.addProgram(DefaultPrograms.BACK_LIGHTS);
		this.groups.add(lights_rear);
		//
		TurboList light_right = new TurboList("light_right");
		light_right.add(new ModelRendererTurbo(light_right, 73, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-100.5f, -1.2f, -12).setRotationAngle(0, 0, -0).setName("Box 146")
		);
		light_right.addProgram(DefaultPrograms.TURN_SIGNAL_RIGHT);
		this.groups.add(light_right);
		//
		TurboList light_left = new TurboList("light_left");
		light_left.add(new ModelRendererTurbo(light_left, 49, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-100.5f, -1.2f, 11).setRotationAngle(0, 0, -0).setName("Box 145")
		);
		light_left.addProgram(DefaultPrograms.TURN_SIGNAL_LEFT);
		this.groups.add(light_left);
		//
		TurboList door_rf = new TurboList("door_rf");
		door_rf.add(new ModelRendererTurbo(door_rf, 265, 97, textureX, textureY)
			.addShapeBox(-12, 0, -1, 12, 18, 1, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -19.7f, -15).setRotationAngle(0, 0, -0).setName("Box 215")
		);
		door_rf.add(new ModelRendererTurbo(door_rf, 505, 33, textureX, textureY).addBox(-10, 0, -1.3f, 2, 1, 1)
			.setRotationPoint(-34, -11.7f, -15).setRotationAngle(0, 0, -0).setName("Box 218")
		);
		this.groups.add(door_rf);
		//
		TurboList door_rb = new TurboList("door_rb");
		door_rb.add(new ModelRendererTurbo(door_rb, 177, 97, textureX, textureY)
			.addShapeBox(0, 0, -1, 12, 18, 1, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -19.7f, -15).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		door_rb.add(new ModelRendererTurbo(door_rb, 225, 49, textureX, textureY).addBox(8, 0, -1.3f, 2, 1, 1)
			.setRotationPoint(-59, -11.7f, -15).setRotationAngle(0, 0, -0).setName("Box 219")
		);
		this.groups.add(door_rb);
		//
		TurboList door_lf = new TurboList("door_lf");
		door_lf.add(new ModelRendererTurbo(door_lf, 457, 81, textureX, textureY)
			.addShapeBox(-12, 0, 0, 12, 18, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0)
			.setRotationPoint(-34, -19.7f, 15).setRotationAngle(0, 0, -0).setName("Box 213")
		);
		door_lf.add(new ModelRendererTurbo(door_lf, 505, 17, textureX, textureY).addBox(-10, 0, 0.3f, 2, 1, 1)
			.setRotationPoint(-34, -11.7f, 15).setRotationAngle(0, 0, -0).setName("Box 217")
		);
		this.groups.add(door_lf);
		//
		TurboList door_lb = new TurboList("door_lb");
		door_lb.add(new ModelRendererTurbo(door_lb, 41, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 18, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0)
			.setRotationPoint(-59, -19.7f, 15).setRotationAngle(0, 0, -0).setName("Box 212")
		);
		door_lb.add(new ModelRendererTurbo(door_lb, 457, 9, textureX, textureY).addBox(8, 0, 0.3f, 2, 1, 1)
			.setRotationPoint(-59, -11.7f, 15).setRotationAngle(0, 0, -0).setName("Box 216")
		);
		this.groups.add(door_lb);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 49, 49, textureX, textureY).addBox(0, 0, 0, 40, 7, 1)
			.setRotationPoint(-100, -8.7f, -15).setRotationAngle(0, 0, -0).setName("Box 154")
		);
		primary.add(new ModelRendererTurbo(primary, 137, 49, textureX, textureY).addBox(0, 0, 0, 40, 7, 1)
			.setRotationPoint(-100, -8.7f, 14).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		primary.add(new ModelRendererTurbo(primary, 497, 41, textureX, textureY).addBox(0, 0, 0, 4, 7, 1)
			.setRotationPoint(-33, -8.7f, 14).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		primary.add(new ModelRendererTurbo(primary, 1, 57, textureX, textureY).addBox(0, 0, 0, 4, 7, 1)
			.setRotationPoint(-33, -8.7f, -15).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		primary.add(new ModelRendererTurbo(primary, 385, 41, textureX, textureY).addBox(0, 0, 0, 1, 7, 28)
			.setRotationPoint(-30, -8.7f, -14).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		primary.add(new ModelRendererTurbo(primary, 449, 41, textureX, textureY).addBox(0, 0, 0, 1, 6, 28)
			.setRotationPoint(-100, -7.7f, -14).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList secondary = new TurboList("secondary");
		secondary.add(new ModelRendererTurbo(secondary, 169, 65, textureX, textureY).addBox(0, 0, 0, 1, 19, 9)
			.setRotationPoint(-34, -20.7f, 6).setRotationAngle(0, 0, -0).setName("Box 191")
		);
		secondary.add(new ModelRendererTurbo(secondary, 193, 65, textureX, textureY).addBox(0, 0, 0, 1, 19, 9)
			.setRotationPoint(-34, -20.7f, -15).setRotationAngle(0, 0, -0).setName("Box 192")
		);
		secondary.add(new ModelRendererTurbo(secondary, 217, 73, textureX, textureY).addBox(0, 0, 0, 1, 19, 9)
			.setRotationPoint(-60, -20.7f, -15).setRotationAngle(0, 0, -0).setName("Box 193")
		);
		secondary.add(new ModelRendererTurbo(secondary, 241, 73, textureX, textureY).addBox(0, 0, 0, 1, 19, 9)
			.setRotationPoint(-60, -20.7f, 6).setRotationAngle(0, 0, -0).setName("Box 194")
		);
		secondary.add(new ModelRendererTurbo(secondary, 265, 73, textureX, textureY).addBox(0, 0, 0, 25, 19, 1)
			.setRotationPoint(-59, -20.7f, 6).setRotationAngle(0, 0, -0).setName("Box 195")
		);
		secondary.add(new ModelRendererTurbo(secondary, 321, 73, textureX, textureY).addBox(0, 0, 0, 25, 19, 1)
			.setRotationPoint(-59, -20.7f, -7).setRotationAngle(0, 0, -0).setName("Box 196")
		);
		secondary.add(new ModelRendererTurbo(secondary, 385, 81, textureX, textureY).addBox(0, 0, 0, 25, 1, 8)
			.setRotationPoint(-59, -20.7f, 7).setRotationAngle(0, 0, -0).setName("Box 206")
		);
		secondary.add(new ModelRendererTurbo(secondary, 105, 89, textureX, textureY).addBox(0, 0, 0, 25, 1, 8)
			.setRotationPoint(-59, -20.7f, -15).setRotationAngle(0, 0, -0).setName("Box 207")
		);
		secondary.add(new ModelRendererTurbo(secondary, 489, 49, textureX, textureY).addBox(0, 0, 0, 1, 18, 1)
			.setRotationPoint(-47, -19.7f, 14).setRotationAngle(0, 0, -0).setName("Box 208")
		);
		secondary.add(new ModelRendererTurbo(secondary, 1, 81, textureX, textureY).addBox(0, 0, 0, 1, 18, 1)
			.setRotationPoint(-47, -19.7f, -15).setRotationAngle(0, 0, -0).setName("Box 211")
		);
		secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(secondary);
		//
	}

}
