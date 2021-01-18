//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.zmp.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/vehicle/passenger_wagon_01")
public class PassengerWagon01Model extends VehicleModel {

	public PassengerWagon01Model(){
		super(); textureX = 1024; textureY = 1024;
		this.addToCreators("zackyboy19");
		this.addToCreators("Ferdinand");
		//
		TurboList doors_left = new TurboList("doors_left");
		doors_left.add(new ModelRendererTurbo(doors_left, 90, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(101, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1127")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 587, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(103, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1128")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 81, 244, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(99, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1129")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 796, 240, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(97, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1130")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 570, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(96, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1131")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 163, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(103, -40, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1132")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 524, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(101, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1133")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 490, 222, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(99, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1134")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 767, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(97, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1135")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1016, 243, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(96, -40, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1136")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1007, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(94, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1140")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 998, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(104, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1141")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 0, 45, textureX, textureY).addBox(0, 0, 0, 12, 17, 2)
			.setRotationPoint(94, -38, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1142")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 538, 10, textureX, textureY).addBox(0, 0, 0, 12, 17, 2)
			.setRotationPoint(-106, -38, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1179")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 396, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(-106, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1180")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 843, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-104, -40, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1181")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 664, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-103, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1182")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 100, 187, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-101, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1183")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 663, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-97, -40, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1184")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 971, 241, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(-96, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1185")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 72, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99, -39, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1186")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 142, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-97, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1192")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 664, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-99, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1193")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 164, 176, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-101, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1194")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1012, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-103, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1195")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 893, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-104, -54, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1196")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 258, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(95, -37, 24).setRotationAngle(0, 0, 0).setName("Box 1203")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 298, 0, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(96, -37, 25).setRotationAngle(0, 0, 0).setName("Box 1204")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1019, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(99, -37, 24).setRotationAngle(0, 0, 0).setName("Box 1205")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1019, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(-100, -37, 24).setRotationAngle(0, 0, 0).setName("Box 1206")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 29, 0, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-99, -37, 25).setRotationAngle(0, 0, 0).setName("Box 1207")
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 1019, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-96, -37, 24).setRotationAngle(0, 0, 0).setName("Box 1208")
		);
		this.groups.add(doors_left);
		//
		TurboList doors_right = new TurboList("doors_right");
		doors_right.add(new ModelRendererTurbo(doors_right, 989, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(94, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1144")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 234, 239, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(96, -40, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1145")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 743, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(97, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1146")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 710, 219, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(99, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1147")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 790, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(103, -40, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1148")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 980, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(104, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1149")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 690, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(101, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1150")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 1017, 231, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(103, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1156")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 133, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(101, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1157")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 93, 219, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(99, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1158")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 84, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(97, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1159")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 264, 229, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(96, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1160")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 539, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(95, -37, -25).setRotationAngle(0, 0, 0).setName("Box 1200")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 29, 14, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(96, -37, -26).setRotationAngle(0, 0, 0).setName("Box 1201")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 1019, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(99, -37, -25).setRotationAngle(0, 0, 0).setName("Box 1202")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 269, 13, textureX, textureY).addBox(0, 0, 0, 12, 17, 2)
			.setRotationPoint(94, -38, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1143")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 0, 13, textureX, textureY).addBox(0, 0, 0, 12, 17, 2)
			.setRotationPoint(-106, -38, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1161")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 742, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(-106, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1162")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 531, 225, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-104, -40, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1163")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 289, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-103, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1164")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 602, 211, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-101, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1165")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 551, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-97, -40, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1166")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 578, 243, textureX, textureY).addBox(0, 0, 0, 2, 16, 2)
			.setRotationPoint(-96, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1167")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 593, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-99, -39, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1168")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 450, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-97, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1174")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 317, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-99, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1175")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 281, 194, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-101, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1176")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 316, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-103, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 292, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-104, -54, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1178")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 1019, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-100, -37, -25).setRotationAngle(0, 0, 0).setName("Box 1176")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 298, 14, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-99, -37, -26).setRotationAngle(0, 0, 0).setName("Box 1177")
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 1019, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-96, -37, -25).setRotationAngle(0, 0, 0).setName("Box 1178")
		);
		this.groups.add(doors_right);
		//
		TurboList frame = new TurboList("frame");
		frame.add(new ModelRendererTurbo(frame, 199, 278, textureX, textureY).addBox(0, 0, 0, 1, 6, 6)
			.setRotationPoint(114.5f, -16, -3).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		frame.add(new ModelRendererTurbo(frame, 937, 277, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(115.5f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		frame.add(new ModelRendererTurbo(frame, 1012, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(115.5f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		frame.add(new ModelRendererTurbo(frame, 308, 50, textureX, textureY).addBox(0, 0, 0, 4, 3, 1)
			.setRotationPoint(115.5f, -14.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		frame.add(new ModelRendererTurbo(frame, 296, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		frame.add(new ModelRendererTurbo(frame, 576, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -15.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		frame.add(new ModelRendererTurbo(frame, 569, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -11.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(114.5f, -13.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		frame.add(new ModelRendererTurbo(frame, 304, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(115.5f, -13.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		frame.add(new ModelRendererTurbo(frame, 957, 277, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(119.5f, -14, -1).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		frame.add(new ModelRendererTurbo(frame, 707, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0)
			.setRotationPoint(120.5f, -14, -2).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		frame.add(new ModelRendererTurbo(frame, 641, 282, textureX, textureY).addBox(0, 0, 0, 1, 6, 8)
			.setRotationPoint(122.5f, -16, -4).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		frame.add(new ModelRendererTurbo(frame, 185, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, 1, -2, 0)
			.setRotationPoint(122.5f, -16, 4).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		frame.add(new ModelRendererTurbo(frame, 567, 277, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(122.5f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		frame.add(new ModelRendererTurbo(frame, 297, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(120.5f, -15, -1.5f).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		frame.add(new ModelRendererTurbo(frame, 290, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(120.5f, -15, 0.5f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		frame.add(new ModelRendererTurbo(frame, 901, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(120.5f, -12, -1.5f).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		frame.add(new ModelRendererTurbo(frame, 1017, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(120.5f, -12, 0.5f).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		frame.add(new ModelRendererTurbo(frame, 528, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(123, -14, -1).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		frame.add(new ModelRendererTurbo(frame, 412, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(123, -14, 0).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		frame.add(new ModelRendererTurbo(frame, 3, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4)
			.setRotationPoint(113, -18, -25).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		frame.add(new ModelRendererTurbo(frame, 741, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 7, 2, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(0, -16, -24.5f).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		frame.add(new ModelRendererTurbo(frame, 179, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 7, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-58, -16, -24.5f).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		frame.add(new ModelRendererTurbo(frame, 643, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4)
			.setRotationPoint(-115, -18, -25).setRotationAngle(0, 0, 0).setName("Box 202")
		);
		frame.add(new ModelRendererTurbo(frame, 98, 281, textureX, textureY).addBox(0, 0, 0, 1, 6, 8)
			.setRotationPoint(-123.5f, -16, -4).setRotationAngle(0, 0, 0).setName("Box 203")
		);
		frame.add(new ModelRendererTurbo(frame, 336, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, -1, -2, 0)
			.setRotationPoint(-123.5f, -16, 4).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		frame.add(new ModelRendererTurbo(frame, 327, 276, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, -1, -1, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -2, 0, 1, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-123.5f, -16, -7).setRotationAngle(0, 0, 0).setName("Box 205")
		);
		frame.add(new ModelRendererTurbo(frame, 109, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-124, -14, 0).setRotationAngle(0, 0, 0).setName("Box 206")
		);
		frame.add(new ModelRendererTurbo(frame, 178, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-124, -14, -1).setRotationAngle(0, 0, 0).setName("Box 207")
		);
		frame.add(new ModelRendererTurbo(frame, 948, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-122.5f, -15, -1.5f).setRotationAngle(0, 0, 0).setName("Box 208")
		);
		frame.add(new ModelRendererTurbo(frame, 749, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-122.5f, -15, 0.5f).setRotationAngle(0, 0, 0).setName("Box 209")
		);
		frame.add(new ModelRendererTurbo(frame, 557, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-122.5f, -14, -2).setRotationAngle(0, 0, 0).setName("Box 210")
		);
		frame.add(new ModelRendererTurbo(frame, 789, 275, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-120.5f, -14, -1).setRotationAngle(0, 0, 0).setName("Box 211")
		);
		frame.add(new ModelRendererTurbo(frame, 666, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-122.5f, -12, -1.5f).setRotationAngle(0, 0, 0).setName("Box 212")
		);
		frame.add(new ModelRendererTurbo(frame, 171, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-122.5f, -12, 0.5f).setRotationAngle(0, 0, 0).setName("Box 213")
		);
		frame.add(new ModelRendererTurbo(frame, 27, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-119.5f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 214")
		);
		frame.add(new ModelRendererTurbo(frame, 296, 4, textureX, textureY).addBox(0, 0, 0, 4, 3, 1)
			.setRotationPoint(-119.5f, -14.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 215")
		);
		frame.add(new ModelRendererTurbo(frame, 27, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-119.5f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 216")
		);
		frame.add(new ModelRendererTurbo(frame, 780, 275, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-116.5f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		frame.add(new ModelRendererTurbo(frame, 164, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -13.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		frame.add(new ModelRendererTurbo(frame, 1017, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -15.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		frame.add(new ModelRendererTurbo(frame, 249, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-117.5f, -11.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 220")
		);
		frame.add(new ModelRendererTurbo(frame, 765, 275, textureX, textureY).addBox(0, 0, 0, 1, 6, 6)
			.setRotationPoint(-115.5f, -16, -3).setRotationAngle(0, 0, 0).setName("Box 221")
		);
		frame.add(new ModelRendererTurbo(frame, 187, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-116.5f, -13.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 222")
		);
		frame.add(new ModelRendererTurbo(frame, 793, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -18, -24.5f).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 7, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-58, -16, 22.5f).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 7, 2, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(0, -16, 22.5f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		frame.add(new ModelRendererTurbo(frame, 241, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4)
			.setRotationPoint(113, -10, -21).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		frame.add(new ModelRendererTurbo(frame, 152, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4)
			.setRotationPoint(-115, -10, -21).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		frame.add(new ModelRendererTurbo(frame, 1012, 71, textureX, textureY).addBox(0, 0, 0, 3, 6, 1)
			.setRotationPoint(84, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		frame.add(new ModelRendererTurbo(frame, 577, 69, textureX, textureY).addBox(0, 0, 0, 3, 6, 1)
			.setRotationPoint(84, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		frame.add(new ModelRendererTurbo(frame, 756, 275, textureX, textureY).addBox(0, 0, 0, 1, 6, 3)
			.setRotationPoint(83, -19, -1.5f).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		frame.add(new ModelRendererTurbo(frame, 459, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(83, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		frame.add(new ModelRendererTurbo(frame, 574, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		frame.add(new ModelRendererTurbo(frame, 188, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(87, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		frame.add(new ModelRendererTurbo(frame, 664, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		frame.add(new ModelRendererTurbo(frame, 375, 275, textureX, textureY).addBox(0, 0, 0, 1, 6, 3)
			.setRotationPoint(87, -19, -1.5f).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 101, textureX, textureY).addBox(0, 0, 0, 60, 6, 1)
			.setRotationPoint(53, -19, 6.5f).setRotationAngle(0, 0, 0).setName("Box 1461")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 93, textureX, textureY).addBox(0, 0, 0, 60, 6, 1)
			.setRotationPoint(53, -19, -8.5f).setRotationAngle(0, 0, 0).setName("Box 1462")
		);
		frame.add(new ModelRendererTurbo(frame, 308, 65, textureX, textureY).addBox(0, 0, 0, 3, 6, 1)
			.setRotationPoint(-87, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 425")
		);
		frame.add(new ModelRendererTurbo(frame, 577, 61, textureX, textureY).addBox(0, 0, 0, 3, 6, 1)
			.setRotationPoint(-87, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 426")
		);
		frame.add(new ModelRendererTurbo(frame, 62, 275, textureX, textureY).addBox(0, 0, 0, 1, 6, 3)
			.setRotationPoint(-88, -19, -1.5f).setRotationAngle(0, 0, 0).setName("Box 427")
		);
		frame.add(new ModelRendererTurbo(frame, 459, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-88, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 428")
		);
		frame.add(new ModelRendererTurbo(frame, 316, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-88, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 429")
		);
		frame.add(new ModelRendererTurbo(frame, 188, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-84, -19, 1.5f).setRotationAngle(0, 0, 0).setName("Box 430")
		);
		frame.add(new ModelRendererTurbo(frame, 48, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84, -19, -2.5f).setRotationAngle(0, 0, 0).setName("Box 431")
		);
		frame.add(new ModelRendererTurbo(frame, 740, 274, textureX, textureY).addBox(0, 0, 0, 1, 6, 3)
			.setRotationPoint(-84, -19, -1.5f).setRotationAngle(0, 0, 0).setName("Box 432")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 117, textureX, textureY).addBox(0, 0, 0, 58, 6, 1)
			.setRotationPoint(-113, -19, 6.5f).setRotationAngle(0, 0, 0).setName("Box 433")
		);
		frame.add(new ModelRendererTurbo(frame, 891, 109, textureX, textureY).addBox(0, 0, 0, 58, 6, 1)
			.setRotationPoint(-113, -19, -8.5f).setRotationAngle(0, 0, 0).setName("Box 434")
		);
		frame.add(new ModelRendererTurbo(frame, 867, 249, textureX, textureY).addBox(0, 0, 0, 2, 8, 46)
			.setRotationPoint(-55, -19, -22.5f).setRotationAngle(0, 0, 0).setName("Box 435")
		);
		frame.add(new ModelRendererTurbo(frame, 705, 243, textureX, textureY).addBox(0, 0, 0, 2, 8, 46)
			.setRotationPoint(51, -19, -22.5f).setRotationAngle(0, 0, 0).setName("Box 436")
		);
		frame.add(new ModelRendererTurbo(frame, 688, 250, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(116.5f, -16, 11.5f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		frame.add(new ModelRendererTurbo(frame, 1017, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -17, 11.5f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		frame.add(new ModelRendererTurbo(frame, 598, 196, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(114.5f, -17, 11.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		frame.add(new ModelRendererTurbo(frame, 593, 196, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(114.5f, -11, 11.5f).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		frame.add(new ModelRendererTurbo(frame, 588, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(116.5f, -12, 11.5f).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		frame.add(new ModelRendererTurbo(frame, 859, 249, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(116.5f, -16, -12.5f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		frame.add(new ModelRendererTurbo(frame, 1017, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -17, -12.5f).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		frame.add(new ModelRendererTurbo(frame, 583, 196, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(114.5f, -17, -12.5f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		frame.add(new ModelRendererTurbo(frame, 908, 195, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(114.5f, -11, -12.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		frame.add(new ModelRendererTurbo(frame, 955, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(116.5f, -12, -12.5f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		frame.add(new ModelRendererTurbo(frame, 817, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -12, -12.5f).setRotationAngle(0, 0, 0).setName("Box 1139")
		);
		frame.add(new ModelRendererTurbo(frame, 1019, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(115.5f, -12, 11.5f).setRotationAngle(0, 0, 0).setName("Box 1140")
		);
		frame.add(new ModelRendererTurbo(frame, 842, 248, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-117.5f, -16, -12.5f).setRotationAngle(0, 0, 0).setName("Box 451")
		);
		frame.add(new ModelRendererTurbo(frame, 734, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -17, -12.5f).setRotationAngle(0, 0, 0).setName("Box 452")
		);
		frame.add(new ModelRendererTurbo(frame, 178, 192, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-115.5f, -17, -12.5f).setRotationAngle(0, 0, 0).setName("Box 453")
		);
		frame.add(new ModelRendererTurbo(frame, 256, 190, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-115.5f, -11, -12.5f).setRotationAngle(0, 0, 0).setName("Box 454")
		);
		frame.add(new ModelRendererTurbo(frame, 326, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-117.5f, -12, -12.5f).setRotationAngle(0, 0, 0).setName("Box 455")
		);
		frame.add(new ModelRendererTurbo(frame, 611, 248, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-117.5f, -16, 11.5f).setRotationAngle(0, 0, 0).setName("Box 456")
		);
		frame.add(new ModelRendererTurbo(frame, 1016, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -17, 11.5f).setRotationAngle(0, 0, 0).setName("Box 457")
		);
		frame.add(new ModelRendererTurbo(frame, 969, 145, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-115.5f, -17, 11.5f).setRotationAngle(0, 0, 0).setName("Box 458")
		);
		frame.add(new ModelRendererTurbo(frame, 608, 142, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-115.5f, -11, 11.5f).setRotationAngle(0, 0, 0).setName("Box 459")
		);
		frame.add(new ModelRendererTurbo(frame, 655, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-117.5f, -12, 11.5f).setRotationAngle(0, 0, 0).setName("Box 460")
		);
		frame.add(new ModelRendererTurbo(frame, 325, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-116.5f, -12, 11.5f).setRotationAngle(0, 0, 0).setName("Box 461")
		);
		frame.add(new ModelRendererTurbo(frame, 735, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-116.5f, -12, -12.5f).setRotationAngle(0, 0, 0).setName("Box 462")
		);
		frame.add(new ModelRendererTurbo(frame, 1012, 60, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(114.5f, -22, -17).setRotationAngle(0, 0, 0).setName("Box 1127")
		);
		frame.add(new ModelRendererTurbo(frame, 308, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(114.5f, -22, -18).setRotationAngle(0, 0, 0).setName("Box 1128")
		);
		frame.add(new ModelRendererTurbo(frame, 577, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(114.5f, -22, -16).setRotationAngle(0, 0, 0).setName("Box 1129")
		);
		frame.add(new ModelRendererTurbo(frame, 124, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(117.5f, -21.5f, -18.5f).setRotationAngle(0, 0, 0).setName("Box 1136")
		);
		frame.add(new ModelRendererTurbo(frame, 535, 274, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(117.5f, -21.5f, -17.5f).setRotationAngle(0, 0, 0).setName("Box 1137")
		);
		frame.add(new ModelRendererTurbo(frame, 767, 230, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(117.5f, -21.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 1138")
		);
		frame.add(new ModelRendererTurbo(frame, 315, 227, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(117.5f, -21.5f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 469")
		);
		frame.add(new ModelRendererTurbo(frame, 528, 274, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(117.5f, -21.5f, 15.5f).setRotationAngle(0, 0, 0).setName("Box 470")
		);
		frame.add(new ModelRendererTurbo(frame, 1019, 224, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(117.5f, -21.5f, 17.5f).setRotationAngle(0, 0, 0).setName("Box 471")
		);
		frame.add(new ModelRendererTurbo(frame, 1012, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(114.5f, -21, 15).setRotationAngle(0, 0, 0).setName("Box 472")
		);
		frame.add(new ModelRendererTurbo(frame, 308, 55, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(114.5f, -21, 16).setRotationAngle(0, 0, 0).setName("Box 473")
		);
		frame.add(new ModelRendererTurbo(frame, 577, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(114.5f, -21, 17).setRotationAngle(0, 0, 0).setName("Box 474")
		);
		frame.add(new ModelRendererTurbo(frame, 298, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-117.5f, -21, -16).setRotationAngle(0, 0, 0).setName("Box 475")
		);
		frame.add(new ModelRendererTurbo(frame, 521, 274, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(-118.5f, -21.5f, -17.5f).setRotationAngle(0, 0, 0).setName("Box 476")
		);
		frame.add(new ModelRendererTurbo(frame, 1019, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-118.5f, -21.5f, -15.5f).setRotationAngle(0, 0, 0).setName("Box 477")
		);
		frame.add(new ModelRendererTurbo(frame, 452, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-118.5f, -21.5f, -18.5f).setRotationAngle(0, 0, 0).setName("Box 478")
		);
		frame.add(new ModelRendererTurbo(frame, 29, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -21, -18).setRotationAngle(0, 0, 0).setName("Box 479")
		);
		frame.add(new ModelRendererTurbo(frame, 298, 22, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-117.5f, -21, -17).setRotationAngle(0, 0, 0).setName("Box 480")
		);
		frame.add(new ModelRendererTurbo(frame, 328, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-118.5f, -21.5f, 14.5f).setRotationAngle(0, 0, 0).setName("Box 481")
		);
		frame.add(new ModelRendererTurbo(frame, 29, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-117.5f, -21, 15).setRotationAngle(0, 0, 0).setName("Box 482")
		);
		frame.add(new ModelRendererTurbo(frame, 298, 17, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
			.setRotationPoint(-117.5f, -21, 16).setRotationAngle(0, 0, 0).setName("Box 483")
		);
		frame.add(new ModelRendererTurbo(frame, 29, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-117.5f, -21, 17).setRotationAngle(0, 0, 0).setName("Box 484")
		);
		frame.add(new ModelRendererTurbo(frame, 1019, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-118.5f, -21.5f, 17.5f).setRotationAngle(0, 0, 0).setName("Box 485")
		);
		frame.add(new ModelRendererTurbo(frame, 514, 274, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(-118.5f, -21.5f, 15.5f).setRotationAngle(0, 0, 0).setName("Box 486")
		);
		frame.add(new ModelRendererTurbo(frame, 773, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(-116, -54, -10).setRotationAngle(0, 0, 0).setName("Box 505")
		);
		frame.add(new ModelRendererTurbo(frame, 768, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(-116, -54, 9).setRotationAngle(0, 0, 0).setName("Box 506")
		);
		frame.add(new ModelRendererTurbo(frame, 544, 299, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(-116, -54, 9).setRotationAngle(0, 0, 0).setName("Box 507")
		);
		frame.add(new ModelRendererTurbo(frame, 498, 299, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(-116, -54, -11).setRotationAngle(0, 0, 0).setName("Box 508")
		);
		frame.add(new ModelRendererTurbo(frame, 763, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(-117, -54, -10).setRotationAngle(0, 0, 0).setName("Box 509")
		);
		frame.add(new ModelRendererTurbo(frame, 758, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(-117, -54, 9).setRotationAngle(0, 0, 0).setName("Box 510")
		);
		frame.add(new ModelRendererTurbo(frame, 493, 299, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(-117, -54, -11).setRotationAngle(0, 0, 0).setName("Box 511")
		);
		frame.add(new ModelRendererTurbo(frame, 488, 299, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(-117, -54, 9).setRotationAngle(0, 0, 0).setName("Box 512")
		);
		frame.add(new ModelRendererTurbo(frame, 494, 250, textureX, textureY).addBox(0, 0, 0, 2, 1, 22)
			.setRotationPoint(-117, -55, -11).setRotationAngle(0, 0, 0).setName("Box 513")
		);
		frame.add(new ModelRendererTurbo(frame, 864, 249, textureX, textureY).addBox(0, 0, 0, 2, 1, 22)
			.setRotationPoint(-117, -21, -11).setRotationAngle(0, 0, 0).setName("Box 514")
		);
		frame.add(new ModelRendererTurbo(frame, 530, 248, textureX, textureY).addBox(0, 0, 0, 2, 1, 22)
			.setRotationPoint(115, -21, -11).setRotationAngle(0, 0, 0).setName("Box 515")
		);
		frame.add(new ModelRendererTurbo(frame, 753, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(115, -54, -10).setRotationAngle(0, 0, 0).setName("Box 516")
		);
		frame.add(new ModelRendererTurbo(frame, 748, 298, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(116, -54, -10).setRotationAngle(0, 0, 0).setName("Box 517")
		);
		frame.add(new ModelRendererTurbo(frame, 964, 287, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(115, -54, 9).setRotationAngle(0, 0, 0).setName("Box 518")
		);
		frame.add(new ModelRendererTurbo(frame, 793, 298, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(116, -54, 9).setRotationAngle(0, 0, 0).setName("Box 519")
		);
		frame.add(new ModelRendererTurbo(frame, 788, 298, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(117, -54, 9).setRotationAngle(0, 0, 0).setName("Box 520")
		);
		frame.add(new ModelRendererTurbo(frame, 1015, 274, textureX, textureY).addBox(0, 0, 0, 1, 33, 1)
			.setRotationPoint(116, -54, 9).setRotationAngle(0, 0, 0).setName("Box 521")
		);
		frame.add(new ModelRendererTurbo(frame, 783, 298, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(117, -54, -11).setRotationAngle(0, 0, 0).setName("Box 522")
		);
		frame.add(new ModelRendererTurbo(frame, 778, 298, textureX, textureY).addBox(0, 0, 0, 0, 33, 2)
			.setRotationPoint(116, -54, -11).setRotationAngle(0, 0, 0).setName("Box 523")
		);
		frame.add(new ModelRendererTurbo(frame, 70, 248, textureX, textureY).addBox(0, 0, 0, 2, 1, 22)
			.setRotationPoint(115, -55, -11).setRotationAngle(0, 0, 0).setName("Box 524")
		);
		frame.add(new ModelRendererTurbo(frame, 862, 179, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 3, 2, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(0, -9, -23.5f).setRotationAngle(0, 0, 0).setName("Box 529")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 3, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-53, -9, -23.5f).setRotationAngle(0, 0, 0).setName("Box 530")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 3, 2, 0, 0, 0, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(0, -9, 21.5f).setRotationAngle(0, 0, 0).setName("Box 531")
		);
		frame.add(new ModelRendererTurbo(frame, 862, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 53, 3, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-53, -9, 21.5f).setRotationAngle(0, 0, 0).setName("Box 532")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 173, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -27, -25.5f).setRotationAngle(0, 0, 0).setName("Box 670")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 173, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -25, -25.5f).setRotationAngle(0, 0, 0).setName("Box 671")
		);
		frame.add(new ModelRendererTurbo(frame, 741, 170, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -23, -25.5f).setRotationAngle(0, 0, 0).setName("Box 672")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 170, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -29, -25.5f).setRotationAngle(0, 0, 0).setName("Box 673")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 170, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -29, -25.5f).setRotationAngle(0, 0, 0).setName("Box 676")
		);
		frame.add(new ModelRendererTurbo(frame, 741, 167, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -27, -25.5f).setRotationAngle(0, 0, 0).setName("Box 677")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 167, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -25, -25.5f).setRotationAngle(0, 0, 0).setName("Box 678")
		);
		frame.add(new ModelRendererTurbo(frame, 741, 164, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -23, -25.5f).setRotationAngle(0, 0, 0).setName("Box 679")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 164, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -29, 24.5f).setRotationAngle(0, 0, 0).setName("Box 681")
		);
		frame.add(new ModelRendererTurbo(frame, 819, 90, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -27, 24.5f).setRotationAngle(0, 0, 0).setName("Box 682")
		);
		frame.add(new ModelRendererTurbo(frame, 819, 87, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -25, 24.5f).setRotationAngle(0, 0, 0).setName("Box 683")
		);
		frame.add(new ModelRendererTurbo(frame, 281, 47, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(-88, -23, 24.5f).setRotationAngle(0, 0, 0).setName("Box 684")
		);
		frame.add(new ModelRendererTurbo(frame, 813, 45, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -23, 24.5f).setRotationAngle(0, 0, 0).setName("Box 685")
		);
		frame.add(new ModelRendererTurbo(frame, 813, 42, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -25, 24.5f).setRotationAngle(0, 0, 0).setName("Box 686")
		);
		frame.add(new ModelRendererTurbo(frame, 813, 39, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -27, 24.5f).setRotationAngle(0, 0, 0).setName("Box 687")
		);
		frame.add(new ModelRendererTurbo(frame, 813, 36, textureX, textureY).addBox(0, 0, 0, 88, 1, 1)
			.setRotationPoint(0, -29, 24.5f).setRotationAngle(0, 0, 0).setName("Box 688")
		);
		frame.add(new ModelRendererTurbo(frame, 538, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(94, -16, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1121")
		);
		frame.add(new ModelRendererTurbo(frame, 343, 271, textureX, textureY).addBox(0, 0, 0, 1, 33, 18)
			.setRotationPoint(-116, -54, -9).setRotationAngle(0, 0, 0).setName("Box 1123")
		);
		frame.add(new ModelRendererTurbo(frame, 973, 269, textureX, textureY).addBox(0, 0, 0, 1, 33, 18)
			.setRotationPoint(115, -54, -9).setRotationAngle(0, 0, 0).setName("Box 1124")
		);
		frame.add(new ModelRendererTurbo(frame, 269, 10, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-106, -21, -26).setRotationAngle(0, 0, 0).setName("Box 1209")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 10, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-106, -21, 25).setRotationAngle(0, 0, 0).setName("Box 1210")
		);
		frame.add(new ModelRendererTurbo(frame, 538, 7, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(94, -21, 25).setRotationAngle(0, 0, 0).setName("Box 1211")
		);
		frame.add(new ModelRendererTurbo(frame, 269, 7, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(94, -21, -26).setRotationAngle(0, 0, 0).setName("Box 1212")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 7, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(94, -19, -26).setRotationAngle(0, 0, 0).setName("Box 1213")
		);
		frame.add(new ModelRendererTurbo(frame, 538, 4, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(94, -19, 25).setRotationAngle(0, 0, 0).setName("Box 1214")
		);
		frame.add(new ModelRendererTurbo(frame, 269, 4, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-106, -19, 25).setRotationAngle(0, 0, 0).setName("Box 1215")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 4, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
			.setRotationPoint(-106, -19, -26).setRotationAngle(0, 0, 0).setName("Box 1216")
		);
		frame.add(new ModelRendererTurbo(frame, 562, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -18, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1217")
		);
		frame.add(new ModelRendererTurbo(frame, 538, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(94, -16, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1218")
		);
		frame.add(new ModelRendererTurbo(frame, 281, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-113, -18, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1219")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 113, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-113, -18, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1220")
		);
		frame.add(new ModelRendererTurbo(frame, 269, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-106, -16, -24.5f).setRotationAngle(0, 0, 0).setName("Box 1221")
		);
		frame.add(new ModelRendererTurbo(frame, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-106, -16, 22.5f).setRotationAngle(0, 0, 0).setName("Box 1222")
		);
		this.groups.add(frame);
		//
		this.addPrimary();
	}

	private void addPrimary(){
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 610, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 50, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-115, -61, -25).setRotationAngle(0, 0, 0).setName("Box 488")
		);
		primary.add(new ModelRendererTurbo(primary, 283, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 48, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-115, -63, -24).setRotationAngle(0, 0, 0).setName("Box 490")
		);
		primary.add(new ModelRendererTurbo(primary, 544, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 44, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-115, -65, -22).setRotationAngle(0, 0, 0).setName("Box 491")
		);
		primary.add(new ModelRendererTurbo(primary, 281, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 1, 38, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-115, -66, -19).setRotationAngle(0, 0, 0).setName("Box 492")
		);
		primary.add(new ModelRendererTurbo(primary, 562, 156, textureX, textureY).addBox(0, 0, 0, 111, 5, 2)
			.setRotationPoint(-111, -59, -25).setRotationAngle(0, 0, 0).setName("Box 504")
		);
		primary.add(new ModelRendererTurbo(primary, 712, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(106, -54, -25).setRotationAngle(0, 0, 0).setName("Box 534")
		);
		primary.add(new ModelRendererTurbo(primary, 114, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-21, -54, -25).setRotationAngle(0, 0, 0).setName("Box 605")
		);
		primary.add(new ModelRendererTurbo(primary, 322, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82, -37, -25).setRotationAngle(0, 0, 0).setName("Box 606")
		);
		primary.add(new ModelRendererTurbo(primary, 712, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -38, -25).setRotationAngle(0, 0, 0).setName("Box 607")
		);
		primary.add(new ModelRendererTurbo(primary, 294, 34, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(78, -37, -25).setRotationAngle(0, 0, 0).setName("Box 608")
		);
		primary.add(new ModelRendererTurbo(primary, 313, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76, -37, -25).setRotationAngle(0, 0, 0).setName("Box 609")
		);
		primary.add(new ModelRendererTurbo(primary, 705, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -38, -25).setRotationAngle(0, 0, 0).setName("Box 610")
		);
		primary.add(new ModelRendererTurbo(primary, 371, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(75, -54, -25).setRotationAngle(0, 0, 0).setName("Box 615")
		);
		primary.add(new ModelRendererTurbo(primary, 304, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(76, -54, -25).setRotationAngle(0, 0, 0).setName("Box 616")
		);
		primary.add(new ModelRendererTurbo(primary, 25, 34, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(78, -54, -25).setRotationAngle(0, 0, 0).setName("Box 618")
		);
		primary.add(new ModelRendererTurbo(primary, 295, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(82, -54, -25).setRotationAngle(0, 0, 0).setName("Box 619")
		);
		primary.add(new ModelRendererTurbo(primary, 68, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(84, -54, -25).setRotationAngle(0, 0, 0).setName("Box 620")
		);
		primary.add(new ModelRendererTurbo(primary, 63, 212, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(67, -54, -25).setRotationAngle(0, 0, 0).setName("Box 621")
		);
		primary.add(new ModelRendererTurbo(primary, 58, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, -38, -25).setRotationAngle(0, 0, 0).setName("Box 622")
		);
		primary.add(new ModelRendererTurbo(primary, 185, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64, -37, -25).setRotationAngle(0, 0, 0).setName("Box 623")
		);
		primary.add(new ModelRendererTurbo(primary, 345, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(58, -37, -25).setRotationAngle(0, 0, 0).setName("Box 624")
		);
		primary.add(new ModelRendererTurbo(primary, 176, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -37, -25).setRotationAngle(0, 0, 0).setName("Box 625")
		);
		primary.add(new ModelRendererTurbo(primary, 981, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -38, -25).setRotationAngle(0, 0, 0).setName("Box 626")
		);
		primary.add(new ModelRendererTurbo(primary, 918, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(55, -54, -25).setRotationAngle(0, 0, 0).setName("Box 630")
		);
		primary.add(new ModelRendererTurbo(primary, 83, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(56, -54, -25).setRotationAngle(0, 0, 0).setName("Box 631")
		);
		primary.add(new ModelRendererTurbo(primary, 281, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(58, -54, -25).setRotationAngle(0, 0, 0).setName("Box 632")
		);
		primary.add(new ModelRendererTurbo(primary, 74, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(64, -54, -25).setRotationAngle(0, 0, 0).setName("Box 633")
		);
		primary.add(new ModelRendererTurbo(primary, 567, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(66, -54, -25).setRotationAngle(0, 0, 0).setName("Box 634")
		);
		primary.add(new ModelRendererTurbo(primary, 99, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(50, -54, -25).setRotationAngle(0, 0, 0).setName("Box 637")
		);
		primary.add(new ModelRendererTurbo(primary, 560, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(49, -54, -25).setRotationAngle(0, 0, 0).setName("Box 638")
		);
		primary.add(new ModelRendererTurbo(primary, 65, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(47, -54, -25).setRotationAngle(0, 0, 0).setName("Box 639")
		);
		primary.add(new ModelRendererTurbo(primary, 595, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(41, -54, -25).setRotationAngle(0, 0, 0).setName("Box 640")
		);
		primary.add(new ModelRendererTurbo(primary, 56, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(39, -54, -25).setRotationAngle(0, 0, 0).setName("Box 641")
		);
		primary.add(new ModelRendererTurbo(primary, 553, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(38, -54, -25).setRotationAngle(0, 0, 0).setName("Box 642")
		);
		primary.add(new ModelRendererTurbo(primary, 546, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -38, -25).setRotationAngle(0, 0, 0).setName("Box 643")
		);
		primary.add(new ModelRendererTurbo(primary, 1016, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -37, -25).setRotationAngle(0, 0, 0).setName("Box 644")
		);
		primary.add(new ModelRendererTurbo(primary, 493, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(41, -37, -25).setRotationAngle(0, 0, 0).setName("Box 645")
		);
		primary.add(new ModelRendererTurbo(primary, 47, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -37, -25).setRotationAngle(0, 0, 0).setName("Box 646")
		);
		primary.add(new ModelRendererTurbo(primary, 364, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -38, -25).setRotationAngle(0, 0, 0).setName("Box 647")
		);
		primary.add(new ModelRendererTurbo(primary, 201, 223, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(33, -54, -25).setRotationAngle(0, 0, 0).setName("Box 653")
		);
		primary.add(new ModelRendererTurbo(primary, 698, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -38, -25).setRotationAngle(0, 0, 0).setName("Box 654")
		);
		primary.add(new ModelRendererTurbo(primary, 38, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -37, -25).setRotationAngle(0, 0, 0).setName("Box 655")
		);
		primary.add(new ModelRendererTurbo(primary, 456, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(24, -37, -25).setRotationAngle(0, 0, 0).setName("Box 656")
		);
		primary.add(new ModelRendererTurbo(primary, 29, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -37, -25).setRotationAngle(0, 0, 0).setName("Box 657")
		);
		primary.add(new ModelRendererTurbo(primary, 623, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -38, -25).setRotationAngle(0, 0, 0).setName("Box 658")
		);
		primary.add(new ModelRendererTurbo(primary, 616, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(21, -54, -25).setRotationAngle(0, 0, 0).setName("Box 662")
		);
		primary.add(new ModelRendererTurbo(primary, 9, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(22, -54, -25).setRotationAngle(0, 0, 0).setName("Box 663")
		);
		primary.add(new ModelRendererTurbo(primary, 419, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(24, -54, -25).setRotationAngle(0, 0, 0).setName("Box 664")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(30, -54, -25).setRotationAngle(0, 0, 0).setName("Box 665")
		);
		primary.add(new ModelRendererTurbo(primary, 484, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(32, -54, -25).setRotationAngle(0, 0, 0).setName("Box 666")
		);
		primary.add(new ModelRendererTurbo(primary, 186, 223, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(16, -54, -25).setRotationAngle(0, 0, 0).setName("Box 669")
		);
		primary.add(new ModelRendererTurbo(primary, 477, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -38, -25).setRotationAngle(0, 0, 0).setName("Box 702")
		);
		primary.add(new ModelRendererTurbo(primary, 426, 247, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, -37, -25).setRotationAngle(0, 0, 0).setName("Box 703")
		);
		primary.add(new ModelRendererTurbo(primary, 382, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(7, -37, -25).setRotationAngle(0, 0, 0).setName("Box 704")
		);
		primary.add(new ModelRendererTurbo(primary, 960, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -37, -25).setRotationAngle(0, 0, 0).setName("Box 705")
		);
		primary.add(new ModelRendererTurbo(primary, 470, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -38, -25).setRotationAngle(0, 0, 0).setName("Box 706")
		);
		primary.add(new ModelRendererTurbo(primary, 431, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(4, -54, -25).setRotationAngle(0, 0, 0).setName("Box 711")
		);
		primary.add(new ModelRendererTurbo(primary, 951, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(5, -54, -25).setRotationAngle(0, 0, 0).setName("Box 712")
		);
		primary.add(new ModelRendererTurbo(primary, 345, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(7, -54, -25).setRotationAngle(0, 0, 0).setName("Box 713")
		);
		primary.add(new ModelRendererTurbo(primary, 942, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(13, -54, -25).setRotationAngle(0, 0, 0).setName("Box 714")
		);
		primary.add(new ModelRendererTurbo(primary, 348, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(15, -54, -25).setRotationAngle(0, 0, 0).setName("Box 715")
		);
		primary.add(new ModelRendererTurbo(primary, 341, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -38, -25).setRotationAngle(0, 0, 0).setName("Box 717")
		);
		primary.add(new ModelRendererTurbo(primary, 933, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15, -37, -25).setRotationAngle(0, 0, 0).setName("Box 718")
		);
		primary.add(new ModelRendererTurbo(primary, 281, 203, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-13, -37, -25).setRotationAngle(0, 0, 0).setName("Box 719")
		);
		primary.add(new ModelRendererTurbo(primary, 733, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, -37, -25).setRotationAngle(0, 0, 0).setName("Box 720")
		);
		primary.add(new ModelRendererTurbo(primary, 334, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -38, -25).setRotationAngle(0, 0, 0).setName("Box 721")
		);
		primary.add(new ModelRendererTurbo(primary, 724, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-15, -54, -25).setRotationAngle(0, 0, 0).setName("Box 727")
		);
		primary.add(new ModelRendererTurbo(primary, 635, 200, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-13, -54, -25).setRotationAngle(0, 0, 0).setName("Box 728")
		);
		primary.add(new ModelRendererTurbo(primary, 715, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-7, -54, -25).setRotationAngle(0, 0, 0).setName("Box 729")
		);
		primary.add(new ModelRendererTurbo(primary, 181, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-5, -54, -25).setRotationAngle(0, 0, 0).setName("Box 730")
		);
		primary.add(new ModelRendererTurbo(primary, 42, 212, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(-4, -54, -25).setRotationAngle(0, 0, 0).setName("Box 732")
		);
		primary.add(new ModelRendererTurbo(primary, 281, 149, textureX, textureY).addBox(0, 0, 0, 115, 3, 50)
			.setRotationPoint(0, -21, -25).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		primary.add(new ModelRendererTurbo(primary, 584, 226, textureX, textureY).addBox(0, 0, 0, 4, 5, 50)
			.setRotationPoint(111, -59, -25).setRotationAngle(0, 0, 0).setName("Box 413")
		);
		primary.add(new ModelRendererTurbo(primary, 819, 69, textureX, textureY).addBox(0, 0, 0, 94, 15, 2)
			.setRotationPoint(0, -36, -25).setRotationAngle(0, 0, 0).setName("Box 438")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 50, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -61, -25).setRotationAngle(0, 0, 0).setName("Box 493")
		);
		primary.add(new ModelRendererTurbo(primary, 534, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 48, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -63, -24).setRotationAngle(0, 0, 0).setName("Box 494")
		);
		primary.add(new ModelRendererTurbo(primary, 263, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 2, 44, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -65, -22).setRotationAngle(0, 0, 0).setName("Box 495")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 1, 38, 0, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, -66, -19).setRotationAngle(0, 0, 0).setName("Box 496")
		);
		primary.add(new ModelRendererTurbo(primary, 240, 229, textureX, textureY).addBox(0, 0, 0, 4, 33, 15)
			.setRotationPoint(111, -54, -25).setRotationAngle(0, 0, 0).setName("Box 498")
		);
		primary.add(new ModelRendererTurbo(primary, 757, 226, textureX, textureY).addBox(0, 0, 0, 4, 33, 15)
			.setRotationPoint(111, -54, 10).setRotationAngle(0, 0, 0).setName("Box 500")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 154, textureX, textureY).addBox(0, 0, 0, 112, 5, 2)
			.setRotationPoint(0, -59, -25).setRotationAngle(0, 0, 0).setName("Box 503")
		);
		primary.add(new ModelRendererTurbo(primary, 742, 225, textureX, textureY).addBox(0, 0, 0, 5, 15, 2)
			.setRotationPoint(106, -36, -25).setRotationAngle(0, 0, 0).setName("Box 526")
		);
		primary.add(new ModelRendererTurbo(primary, 916, 209, textureX, textureY).addBox(0, 0, 0, 9, 18, 2)
			.setRotationPoint(85, -54, -25).setRotationAngle(0, 0, 0).setName("Box 536")
		);
		primary.add(new ModelRendererTurbo(primary, 852, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(22, -54, 23).setRotationAngle(0, 0, 0).setName("Box 850")
		);
		primary.add(new ModelRendererTurbo(primary, 565, 32, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(24, -54, 23).setRotationAngle(0, 0, 0).setName("Box 851")
		);
		primary.add(new ModelRendererTurbo(primary, 516, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(30, -54, 23).setRotationAngle(0, 0, 0).setName("Box 852")
		);
		primary.add(new ModelRendererTurbo(primary, 159, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(21, -54, 23).setRotationAngle(0, 0, 0).setName("Box 853")
		);
		primary.add(new ModelRendererTurbo(primary, 79, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(21, -38, 23).setRotationAngle(0, 0, 0).setName("Box 854")
		);
		primary.add(new ModelRendererTurbo(primary, 419, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -37, 23).setRotationAngle(0, 0, 0).setName("Box 855")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 28, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(24, -37, 23).setRotationAngle(0, 0, 0).setName("Box 856")
		);
		primary.add(new ModelRendererTurbo(primary, 410, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30, -37, 23).setRotationAngle(0, 0, 0).setName("Box 857")
		);
		primary.add(new ModelRendererTurbo(primary, 72, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -38, 23).setRotationAngle(0, 0, 0).setName("Box 858")
		);
		primary.add(new ModelRendererTurbo(primary, 300, 222, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(16, -54, 23).setRotationAngle(0, 0, 0).setName("Box 861")
		);
		primary.add(new ModelRendererTurbo(primary, 65, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(32, -54, 23).setRotationAngle(0, 0, 0).setName("Box 863")
		);
		primary.add(new ModelRendererTurbo(primary, 698, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(4, -54, 23).setRotationAngle(0, 0, 0).setName("Box 881")
		);
		primary.add(new ModelRendererTurbo(primary, 604, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(5, -54, 23).setRotationAngle(0, 0, 0).setName("Box 882")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 20, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(7, -54, 23).setRotationAngle(0, 0, 0).setName("Box 883")
		);
		primary.add(new ModelRendererTurbo(primary, 587, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(13, -54, 23).setRotationAngle(0, 0, 0).setName("Box 884")
		);
		primary.add(new ModelRendererTurbo(primary, 643, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(15, -54, 23).setRotationAngle(0, 0, 0).setName("Box 885")
		);
		primary.add(new ModelRendererTurbo(primary, 592, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -38, 23).setRotationAngle(0, 0, 0).setName("Box 886")
		);
		primary.add(new ModelRendererTurbo(primary, 185, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -37, 23).setRotationAngle(0, 0, 0).setName("Box 887")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 12, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(7, -37, 23).setRotationAngle(0, 0, 0).setName("Box 889")
		);
		primary.add(new ModelRendererTurbo(primary, 176, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, -37, 23).setRotationAngle(0, 0, 0).setName("Box 890")
		);
		primary.add(new ModelRendererTurbo(primary, 852, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -38, 23).setRotationAngle(0, 0, 0).setName("Box 891")
		);
		primary.add(new ModelRendererTurbo(primary, 819, 51, textureX, textureY).addBox(0, 0, 0, 94, 15, 2)
			.setRotationPoint(0, -36, 23).setRotationAngle(0, 0, 0).setName("Box 440")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 162, textureX, textureY).addBox(0, 0, 0, 111, 5, 2)
			.setRotationPoint(0, -59, 23).setRotationAngle(0, 0, 0).setName("Box 501")
		);
		primary.add(new ModelRendererTurbo(primary, 589, 226, textureX, textureY).addBox(0, 0, 0, 5, 15, 2)
			.setRotationPoint(106, -36, 23).setRotationAngle(0, 0, 0).setName("Box 525")
		);
		primary.add(new ModelRendererTurbo(primary, 727, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(106, -54, 23).setRotationAngle(0, 0, 0).setName("Box 533")
		);
		primary.add(new ModelRendererTurbo(primary, 939, 210, textureX, textureY).addBox(0, 0, 0, 9, 18, 2)
			.setRotationPoint(85, -54, 23).setRotationAngle(0, 0, 0).setName("Box 535")
		);
		primary.add(new ModelRendererTurbo(primary, 995, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75, -38, 23).setRotationAngle(0, 0, 0).setName("Box 817")
		);
		primary.add(new ModelRendererTurbo(primary, 924, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76, -37, 23).setRotationAngle(0, 0, 0).setName("Box 818")
		);
		primary.add(new ModelRendererTurbo(primary, 567, 16, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(78, -37, 23).setRotationAngle(0, 0, 0).setName("Box 819")
		);
		primary.add(new ModelRendererTurbo(primary, 915, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(82, -37, 23).setRotationAngle(0, 0, 0).setName("Box 820")
		);
		primary.add(new ModelRendererTurbo(primary, 988, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -38, 23).setRotationAngle(0, 0, 0).setName("Box 821")
		);
		primary.add(new ModelRendererTurbo(primary, 723, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(75, -54, 23).setRotationAngle(0, 0, 0).setName("Box 822")
		);
		primary.add(new ModelRendererTurbo(primary, 906, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(76, -54, 23).setRotationAngle(0, 0, 0).setName("Box 823")
		);
		primary.add(new ModelRendererTurbo(primary, 567, 12, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(78, -54, 23).setRotationAngle(0, 0, 0).setName("Box 824")
		);
		primary.add(new ModelRendererTurbo(primary, 897, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(82, -54, 23).setRotationAngle(0, 0, 0).setName("Box 825")
		);
		primary.add(new ModelRendererTurbo(primary, 477, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(84, -54, 23).setRotationAngle(0, 0, 0).setName("Box 826")
		);
		primary.add(new ModelRendererTurbo(primary, 888, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(64, -54, 23).setRotationAngle(0, 0, 0).setName("Box 829")
		);
		primary.add(new ModelRendererTurbo(primary, 470, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(66, -54, 23).setRotationAngle(0, 0, 0).setName("Box 830")
		);
		primary.add(new ModelRendererTurbo(primary, 962, 210, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(67, -54, 23).setRotationAngle(0, 0, 0).setName("Box 831")
		);
		primary.add(new ModelRendererTurbo(primary, 565, 36, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(58, -54, 23).setRotationAngle(0, 0, 0).setName("Box 832")
		);
		primary.add(new ModelRendererTurbo(primary, 559, 222, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(50, -54, 23).setRotationAngle(0, 0, 0).setName("Box 833")
		);
		primary.add(new ModelRendererTurbo(primary, 879, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(56, -54, 23).setRotationAngle(0, 0, 0).setName("Box 834")
		);
		primary.add(new ModelRendererTurbo(primary, 334, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(55, -54, 23).setRotationAngle(0, 0, 0).setName("Box 835")
		);
		primary.add(new ModelRendererTurbo(primary, 327, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, -38, 23).setRotationAngle(0, 0, 0).setName("Box 841")
		);
		primary.add(new ModelRendererTurbo(primary, 870, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64, -37, 23).setRotationAngle(0, 0, 0).setName("Box 842")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 32, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(58, -37, 23).setRotationAngle(0, 0, 0).setName("Box 843")
		);
		primary.add(new ModelRendererTurbo(primary, 861, 245, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -37, 23).setRotationAngle(0, 0, 0).setName("Box 844")
		);
		primary.add(new ModelRendererTurbo(primary, 166, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -38, 23).setRotationAngle(0, 0, 0).setName("Box 845")
		);
		primary.add(new ModelRendererTurbo(primary, 1004, 212, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(33, -54, 23).setRotationAngle(0, 0, 0).setName("Box 862")
		);
		primary.add(new ModelRendererTurbo(primary, 655, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(38, -54, 23).setRotationAngle(0, 0, 0).setName("Box 864")
		);
		primary.add(new ModelRendererTurbo(primary, 835, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(39, -54, 23).setRotationAngle(0, 0, 0).setName("Box 865")
		);
		primary.add(new ModelRendererTurbo(primary, 565, 28, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(41, -54, 23).setRotationAngle(0, 0, 0).setName("Box 866")
		);
		primary.add(new ModelRendererTurbo(primary, 622, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(47, -54, 23).setRotationAngle(0, 0, 0).setName("Box 867")
		);
		primary.add(new ModelRendererTurbo(primary, 969, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(49, -54, 23).setRotationAngle(0, 0, 0).setName("Box 868")
		);
		primary.add(new ModelRendererTurbo(primary, 957, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38, -38, 23).setRotationAngle(0, 0, 0).setName("Box 871")
		);
		primary.add(new ModelRendererTurbo(primary, 937, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -37, 23).setRotationAngle(0, 0, 0).setName("Box 872")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 24, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(41, -37, 23).setRotationAngle(0, 0, 0).setName("Box 873")
		);
		primary.add(new ModelRendererTurbo(primary, 613, 244, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -37, 23).setRotationAngle(0, 0, 0).setName("Box 874")
		);
		primary.add(new ModelRendererTurbo(primary, 927, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -38, 23).setRotationAngle(0, 0, 0).setName("Box 875")
		);
		primary.add(new ModelRendererTurbo(primary, 604, 226, textureX, textureY).addBox(0, 0, 0, 5, 15, 2)
			.setRotationPoint(-111, -36, 23).setRotationAngle(0, 0, 0).setName("Box 439")
		);
		primary.add(new ModelRendererTurbo(primary, 201, 229, textureX, textureY).addBox(0, 0, 0, 4, 33, 15)
			.setRotationPoint(-115, -54, 10).setRotationAngle(0, 0, 0).setName("Box 499")
		);
		primary.add(new ModelRendererTurbo(primary, 789, 156, textureX, textureY).addBox(0, 0, 0, 111, 5, 2)
			.setRotationPoint(-111, -59, 23).setRotationAngle(0, 0, 0).setName("Box 502")
		);
		primary.add(new ModelRendererTurbo(primary, 893, 209, textureX, textureY).addBox(0, 0, 0, 9, 18, 2)
			.setRotationPoint(-94, -54, 23).setRotationAngle(0, 0, 0).setName("Box 537")
		);
		primary.add(new ModelRendererTurbo(primary, 697, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-111, -54, 23).setRotationAngle(0, 0, 0).setName("Box 539")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 100, textureX, textureY).addBox(0, 0, 0, 115, 3, 50)
			.setRotationPoint(-115, -21, -25).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		primary.add(new ModelRendererTurbo(primary, 79, 225, textureX, textureY).addBox(0, 0, 0, 4, 5, 50)
			.setRotationPoint(-115, -59, -25).setRotationAngle(0, 0, 0).setName("Box 414")
		);
		primary.add(new ModelRendererTurbo(primary, 619, 226, textureX, textureY).addBox(0, 0, 0, 5, 15, 2)
			.setRotationPoint(-111, -36, -25).setRotationAngle(0, 0, 0).setName("Box 437")
		);
		primary.add(new ModelRendererTurbo(primary, 796, 229, textureX, textureY).addBox(0, 0, 0, 4, 33, 15)
			.setRotationPoint(-115, -54, -25).setRotationAngle(0, 0, 0).setName("Box 497")
		);
		primary.add(new ModelRendererTurbo(primary, 682, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-111, -54, -25).setRotationAngle(0, 0, 0).setName("Box 540")
		);
		primary.add(new ModelRendererTurbo(primary, 706, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84, -37, 23).setRotationAngle(0, 0, 0).setName("Box 736")
		);
		primary.add(new ModelRendererTurbo(primary, 63, 270, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-85, -38, 23).setRotationAngle(0, 0, 0).setName("Box 737")
		);
		primary.add(new ModelRendererTurbo(primary, 567, 24, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(-82, -37, 23).setRotationAngle(0, 0, 0).setName("Box 738")
		);
		primary.add(new ModelRendererTurbo(primary, 697, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-78, -37, 23).setRotationAngle(0, 0, 0).setName("Box 739")
		);
		primary.add(new ModelRendererTurbo(primary, 1016, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, -38, 23).setRotationAngle(0, 0, 0).setName("Box 740")
		);
		primary.add(new ModelRendererTurbo(primary, 21, 212, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(-75, -54, 23).setRotationAngle(0, 0, 0).setName("Box 744")
		);
		primary.add(new ModelRendererTurbo(primary, 688, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-78, -54, 23).setRotationAngle(0, 0, 0).setName("Box 747")
		);
		primary.add(new ModelRendererTurbo(primary, 457, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-76, -54, 23).setRotationAngle(0, 0, 0).setName("Box 748")
		);
		primary.add(new ModelRendererTurbo(primary, 567, 20, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(-82, -54, 23).setRotationAngle(0, 0, 0).setName("Box 749")
		);
		primary.add(new ModelRendererTurbo(primary, 679, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-84, -54, 23).setRotationAngle(0, 0, 0).setName("Box 750")
		);
		primary.add(new ModelRendererTurbo(primary, 450, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-85, -54, 23).setRotationAngle(0, 0, 0).setName("Box 751")
		);
		primary.add(new ModelRendererTurbo(primary, 670, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-66, -54, 23).setRotationAngle(0, 0, 0).setName("Box 752")
		);
		primary.add(new ModelRendererTurbo(primary, 443, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-67, -54, 23).setRotationAngle(0, 0, 0).setName("Box 753")
		);
		primary.add(new ModelRendererTurbo(primary, 824, 199, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-64, -54, 23).setRotationAngle(0, 0, 0).setName("Box 757")
		);
		primary.add(new ModelRendererTurbo(primary, 661, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-58, -54, 23).setRotationAngle(0, 0, 0).setName("Box 758")
		);
		primary.add(new ModelRendererTurbo(primary, 288, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-56, -54, 23).setRotationAngle(0, 0, 0).setName("Box 759")
		);
		primary.add(new ModelRendererTurbo(primary, 119, 267, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, -38, 23).setRotationAngle(0, 0, 0).setName("Box 760")
		);
		primary.add(new ModelRendererTurbo(primary, 652, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -37, 23).setRotationAngle(0, 0, 0).setName("Box 761")
		);
		primary.add(new ModelRendererTurbo(primary, 72, 197, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-64, -37, 23).setRotationAngle(0, 0, 0).setName("Box 762")
		);
		primary.add(new ModelRendererTurbo(primary, 643, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -37, 23).setRotationAngle(0, 0, 0).setName("Box 763")
		);
		primary.add(new ModelRendererTurbo(primary, 1011, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67, -38, 23).setRotationAngle(0, 0, 0).setName("Box 764")
		);
		primary.add(new ModelRendererTurbo(primary, 824, 195, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-47, -54, 23).setRotationAngle(0, 0, 0).setName("Box 778")
		);
		primary.add(new ModelRendererTurbo(primary, 525, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-49, -54, 23).setRotationAngle(0, 0, 0).setName("Box 779")
		);
		primary.add(new ModelRendererTurbo(primary, 509, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-50, -54, 23).setRotationAngle(0, 0, 0).setName("Box 780")
		);
		primary.add(new ModelRendererTurbo(primary, 288, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-41, -54, 23).setRotationAngle(0, 0, 0).setName("Box 781")
		);
		primary.add(new ModelRendererTurbo(primary, 84, 265, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-39, -54, 23).setRotationAngle(0, 0, 0).setName("Box 782")
		);
		primary.add(new ModelRendererTurbo(primary, 974, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-33, -54, 23).setRotationAngle(0, 0, 0).setName("Box 785")
		);
		primary.add(new ModelRendererTurbo(primary, 279, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-32, -54, 23).setRotationAngle(0, 0, 0).setName("Box 786")
		);
		primary.add(new ModelRendererTurbo(primary, 314, 194, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-30, -54, 23).setRotationAngle(0, 0, 0).setName("Box 787")
		);
		primary.add(new ModelRendererTurbo(primary, 192, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-24, -54, 23).setRotationAngle(0, 0, 0).setName("Box 788")
		);
		primary.add(new ModelRendererTurbo(primary, 669, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-22, -54, 23).setRotationAngle(0, 0, 0).setName("Box 789")
		);
		primary.add(new ModelRendererTurbo(primary, 138, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-15, -54, 23).setRotationAngle(0, 0, 0).setName("Box 800")
		);
		primary.add(new ModelRendererTurbo(primary, 43, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-16, -54, 23).setRotationAngle(0, 0, 0).setName("Box 801")
		);
		primary.add(new ModelRendererTurbo(primary, 72, 193, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-13, -54, 23).setRotationAngle(0, 0, 0).setName("Box 802")
		);
		primary.add(new ModelRendererTurbo(primary, 115, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-7, -54, 23).setRotationAngle(0, 0, 0).setName("Box 803")
		);
		primary.add(new ModelRendererTurbo(primary, 36, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-5, -54, 23).setRotationAngle(0, 0, 0).setName("Box 804")
		);
		primary.add(new ModelRendererTurbo(primary, 106, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15, -37, 23).setRotationAngle(0, 0, 0).setName("Box 810")
		);
		primary.add(new ModelRendererTurbo(primary, 29, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -38, 23).setRotationAngle(0, 0, 0).setName("Box 811")
		);
		primary.add(new ModelRendererTurbo(primary, 565, 40, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-13, -37, 23).setRotationAngle(0, 0, 0).setName("Box 812")
		);
		primary.add(new ModelRendererTurbo(primary, 97, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, -37, 23).setRotationAngle(0, 0, 0).setName("Box 813")
		);
		primary.add(new ModelRendererTurbo(primary, 1006, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -38, 23).setRotationAngle(0, 0, 0).setName("Box 814")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 212, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(-4, -54, 23).setRotationAngle(0, 0, 0).setName("Box 815")
		);
		primary.add(new ModelRendererTurbo(primary, 813, 18, textureX, textureY).addBox(0, 0, 0, 94, 15, 2)
			.setRotationPoint(-94, -36, 23).setRotationAngle(0, 0, 0).setName("Box 527")
		);
		primary.add(new ModelRendererTurbo(primary, 385, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-49, -54, -25).setRotationAngle(0, 0, 0).setName("Box 577")
		);
		primary.add(new ModelRendererTurbo(primary, 884, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-50, -54, -25).setRotationAngle(0, 0, 0).setName("Box 578")
		);
		primary.add(new ModelRendererTurbo(primary, 171, 223, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-55, -54, 23).setRotationAngle(0, 0, 0).setName("Box 767")
		);
		primary.add(new ModelRendererTurbo(primary, 635, 196, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-47, -37, 23).setRotationAngle(0, 0, 0).setName("Box 771")
		);
		primary.add(new ModelRendererTurbo(primary, 543, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -37, 23).setRotationAngle(0, 0, 0).setName("Box 772")
		);
		primary.add(new ModelRendererTurbo(primary, 534, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, -37, 23).setRotationAngle(0, 0, 0).setName("Box 773")
		);
		primary.add(new ModelRendererTurbo(primary, 431, 266, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -38, 23).setRotationAngle(0, 0, 0).setName("Box 774")
		);
		primary.add(new ModelRendererTurbo(primary, 84, 223, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-38, -54, 23).setRotationAngle(0, 0, 0).setName("Box 783")
		);
		primary.add(new ModelRendererTurbo(primary, 574, 222, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-21, -54, 23).setRotationAngle(0, 0, 0).setName("Box 784")
		);
		primary.add(new ModelRendererTurbo(primary, 662, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -38, 23).setRotationAngle(0, 0, 0).setName("Box 790")
		);
		primary.add(new ModelRendererTurbo(primary, 156, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -37, 23).setRotationAngle(0, 0, 0).setName("Box 791")
		);
		primary.add(new ModelRendererTurbo(primary, 0, 194, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-30, -37, 23).setRotationAngle(0, 0, 0).setName("Box 792")
		);
		primary.add(new ModelRendererTurbo(primary, 97, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -38, 23).setRotationAngle(0, 0, 0).setName("Box 793")
		);
		primary.add(new ModelRendererTurbo(primary, 147, 246, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -37, 23).setRotationAngle(0, 0, 0).setName("Box 794")
		);
		primary.add(new ModelRendererTurbo(primary, 97, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -38, 23).setRotationAngle(0, 0, 0).setName("Box 793cp")
		);
		primary.add(new ModelRendererTurbo(primary, 813, 0, textureX, textureY).addBox(0, 0, 0, 94, 15, 2)
			.setRotationPoint(-94, -36, -25).setRotationAngle(0, 0, 0).setName("Box 528")
		);
		primary.add(new ModelRendererTurbo(primary, 219, 208, textureX, textureY).addBox(0, 0, 0, 9, 18, 2)
			.setRotationPoint(-94, -54, -25).setRotationAngle(0, 0, 0).setName("Box 538")
		);
		primary.add(new ModelRendererTurbo(primary, 507, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-85, -54, -25).setRotationAngle(0, 0, 0).setName("Box 547")
		);
		primary.add(new ModelRendererTurbo(primary, 507, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-84, -54, -25).setRotationAngle(0, 0, 0).setName("Box 548")
		);
		primary.add(new ModelRendererTurbo(primary, 498, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-78, -54, -25).setRotationAngle(0, 0, 0).setName("Box 549")
		);
		primary.add(new ModelRendererTurbo(primary, 496, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-76, -54, -25).setRotationAngle(0, 0, 0).setName("Box 550")
		);
		primary.add(new ModelRendererTurbo(primary, 306, 85, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(-82, -54, -25).setRotationAngle(0, 0, 0).setName("Box 551")
		);
		primary.add(new ModelRendererTurbo(primary, 1010, 67, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
			.setRotationPoint(-82, -37, -25).setRotationAngle(0, 0, 0).setName("Box 552")
		);
		primary.add(new ModelRendererTurbo(primary, 489, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-84, -37, -25).setRotationAngle(0, 0, 0).setName("Box 553")
		);
		primary.add(new ModelRendererTurbo(primary, 489, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-85, -38, -25).setRotationAngle(0, 0, 0).setName("Box 554")
		);
		primary.add(new ModelRendererTurbo(primary, 480, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-78, -37, -25).setRotationAngle(0, 0, 0).setName("Box 555")
		);
		primary.add(new ModelRendererTurbo(primary, 452, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76, -38, -25).setRotationAngle(0, 0, 0).setName("Box 556")
		);
		primary.add(new ModelRendererTurbo(primary, 983, 212, textureX, textureY).addBox(0, 0, 0, 8, 18, 2)
			.setRotationPoint(-75, -54, -25).setRotationAngle(0, 0, 0).setName("Box 557")
		);
		primary.add(new ModelRendererTurbo(primary, 353, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56, -38, -25).setRotationAngle(0, 0, 0).setName("Box 563")
		);
		primary.add(new ModelRendererTurbo(primary, 471, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -37, -25).setRotationAngle(0, 0, 0).setName("Box 564")
		);
		primary.add(new ModelRendererTurbo(primary, 202, 208, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-64, -37, -25).setRotationAngle(0, 0, 0).setName("Box 565")
		);
		primary.add(new ModelRendererTurbo(primary, 462, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -37, -25).setRotationAngle(0, 0, 0).setName("Box 566")
		);
		primary.add(new ModelRendererTurbo(primary, 944, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-67, -38, -25).setRotationAngle(0, 0, 0).setName("Box 567")
		);
		primary.add(new ModelRendererTurbo(primary, 905, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-67, -54, -25).setRotationAngle(0, 0, 0).setName("Box 568")
		);
		primary.add(new ModelRendererTurbo(primary, 453, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-66, -54, -25).setRotationAngle(0, 0, 0).setName("Box 569")
		);
		primary.add(new ModelRendererTurbo(primary, 595, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-64, -54, -25).setRotationAngle(0, 0, 0).setName("Box 570")
		);
		primary.add(new ModelRendererTurbo(primary, 444, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-58, -54, -25).setRotationAngle(0, 0, 0).setName("Box 571")
		);
		primary.add(new ModelRendererTurbo(primary, 898, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-56, -54, -25).setRotationAngle(0, 0, 0).setName("Box 572")
		);
		primary.add(new ModelRendererTurbo(primary, 667, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-55, -54, -25).setRotationAngle(0, 0, 0).setName("Box 573")
		);
		primary.add(new ModelRendererTurbo(primary, 891, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-39, -54, -25).setRotationAngle(0, 0, 0).setName("Box 574")
		);
		primary.add(new ModelRendererTurbo(primary, 435, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-41, -54, -25).setRotationAngle(0, 0, 0).setName("Box 575")
		);
		primary.add(new ModelRendererTurbo(primary, 493, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-47, -54, -25).setRotationAngle(0, 0, 0).setName("Box 576")
		);
		primary.add(new ModelRendererTurbo(primary, 173, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -38, -25).setRotationAngle(0, 0, 0).setName("Box 579")
		);
		primary.add(new ModelRendererTurbo(primary, 376, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -37, -25).setRotationAngle(0, 0, 0).setName("Box 580")
		);
		primary.add(new ModelRendererTurbo(primary, 456, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-47, -37, -25).setRotationAngle(0, 0, 0).setName("Box 581")
		);
		primary.add(new ModelRendererTurbo(primary, 367, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, -37, -25).setRotationAngle(0, 0, 0).setName("Box 582")
		);
		primary.add(new ModelRendererTurbo(primary, 871, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -38, -25).setRotationAngle(0, 0, 0).setName("Box 583")
		);
		primary.add(new ModelRendererTurbo(primary, 652, 225, textureX, textureY).addBox(0, 0, 0, 5, 18, 2)
			.setRotationPoint(-38, -54, -25).setRotationAngle(0, 0, 0).setName("Box 589")
		);
		primary.add(new ModelRendererTurbo(primary, 864, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-22, -54, -25).setRotationAngle(0, 0, 0).setName("Box 590")
		);
		primary.add(new ModelRendererTurbo(primary, 358, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-24, -54, -25).setRotationAngle(0, 0, 0).setName("Box 591")
		);
		primary.add(new ModelRendererTurbo(primary, 419, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-30, -54, -25).setRotationAngle(0, 0, 0).setName("Box 592")
		);
		primary.add(new ModelRendererTurbo(primary, 349, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-32, -54, -25).setRotationAngle(0, 0, 0).setName("Box 593")
		);
		primary.add(new ModelRendererTurbo(primary, 733, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-33, -54, -25).setRotationAngle(0, 0, 0).setName("Box 594")
		);
		primary.add(new ModelRendererTurbo(primary, 726, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -38, -25).setRotationAngle(0, 0, 0).setName("Box 595")
		);
		primary.add(new ModelRendererTurbo(primary, 340, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -37, -25).setRotationAngle(0, 0, 0).setName("Box 596")
		);
		primary.add(new ModelRendererTurbo(primary, 382, 207, textureX, textureY).addBox(0, 0, 0, 6, 1, 2)
			.setRotationPoint(-30, -37, -25).setRotationAngle(0, 0, 0).setName("Box 597")
		);
		primary.add(new ModelRendererTurbo(primary, 331, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -37, -25).setRotationAngle(0, 0, 0).setName("Box 598")
		);
		primary.add(new ModelRendererTurbo(primary, 719, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -38, -25).setRotationAngle(0, 0, 0).setName("Box 599")
		);
		primary.add(new ModelRendererTurbo(primary, 327, 271, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-16, -54, -25).setRotationAngle(0, 0, 0).setName("Box 726")
		);
		this.groups.add(primary);
	}

}
