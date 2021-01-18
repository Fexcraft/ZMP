//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.zmp.models.part.wagon;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.1 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "zmp:models/vehicle/passenger_wagon_01_seats")
public class PassengerWagon01Seats extends VehicleModel {

	public PassengerWagon01Seats(){
		super(); textureX = 1024; textureY = 1024;
		this.addToCreators("zackyboy19");
		this.addToCreators("Ferdinand");
		//
		TurboList seats = new TurboList("seats");
		seats.add(new ModelRendererTurbo(seats, 987, 201, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(-71.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1057")
		);
		seats.add(new ModelRendererTurbo(seats, 72, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(-62.5f, -32, 13).setRotationAngle(0, 0, 0).setName("Box 1058")
		);
		seats.add(new ModelRendererTurbo(seats, 726, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1059")
		);
		seats.add(new ModelRendererTurbo(seats, 347, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-74.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1060")
		);
		seats.add(new ModelRendererTurbo(seats, 41, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1061")
		);
		seats.add(new ModelRendererTurbo(seats, 288, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1062")
		);
		seats.add(new ModelRendererTurbo(seats, 65, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1063")
		);
		seats.add(new ModelRendererTurbo(seats, 58, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-73.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1064")
		);
		seats.add(new ModelRendererTurbo(seats, 29, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-71.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1065")
		);
		seats.add(new ModelRendererTurbo(seats, 643, 182, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1066")
		);
		seats.add(new ModelRendererTurbo(seats, 934, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-71.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 1077")
		);
		seats.add(new ModelRendererTurbo(seats, 730, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-73.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 1078")
		);
		seats.add(new ModelRendererTurbo(seats, 58, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 1080")
		);
		seats.add(new ModelRendererTurbo(seats, 723, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 1081")
		);
		seats.add(new ModelRendererTurbo(seats, 16, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 1082")
		);
		seats.add(new ModelRendererTurbo(seats, 966, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 1083")
		);
		seats.add(new ModelRendererTurbo(seats, 281, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(-71.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1084")
		);
		seats.add(new ModelRendererTurbo(seats, 943, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 1085")
		);
		seats.add(new ModelRendererTurbo(seats, 470, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(-62.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1086")
		);
		seats.add(new ModelRendererTurbo(seats, 824, 185, textureX, textureY).addBox(0, 0, 0, 15, 10, 19)
			.setRotationPoint(-77.5f, -31, -22).setRotationAngle(0, 0, 0).setName("Box 1117")
		);
		seats.add(new ModelRendererTurbo(seats, 960, 172, textureX, textureY).addBox(0, 0, 0, 15, 10, 13)
			.setRotationPoint(-77.5f, -31, 11).setRotationAngle(0, 0, 0).setName("Box 1118")
		);
		seats.add(new ModelRendererTurbo(seats, 526, 272, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-74.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 1079")
		);
		seats.add(new ModelRendererTurbo(seats, 690, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 923")
		);
		seats.add(new ModelRendererTurbo(seats, 707, 206, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(-29.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 924")
		);
		seats.add(new ModelRendererTurbo(seats, 635, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 926")
		);
		seats.add(new ModelRendererTurbo(seats, 944, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-29.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 927")
		);
		seats.add(new ModelRendererTurbo(seats, 246, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-32.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 928")
		);
		seats.add(new ModelRendererTurbo(seats, 937, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 929")
		);
		seats.add(new ModelRendererTurbo(seats, 981, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 930")
		);
		seats.add(new ModelRendererTurbo(seats, 209, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 931")
		);
		seats.add(new ModelRendererTurbo(seats, 918, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-31.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 932")
		);
		seats.add(new ModelRendererTurbo(seats, 271, 222, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(-37.5f, -36, -11).setRotationAngle(0, 0, 0).setName("Box 1101")
		);
		seats.add(new ModelRendererTurbo(seats, 811, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-6.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1021")
		);
		seats.add(new ModelRendererTurbo(seats, 375, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1022")
		);
		seats.add(new ModelRendererTurbo(seats, 477, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1023")
		);
		seats.add(new ModelRendererTurbo(seats, 726, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1024")
		);
		seats.add(new ModelRendererTurbo(seats, 354, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(-6.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1035")
		);
		seats.add(new ModelRendererTurbo(seats, 557, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(4.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1036")
		);
		seats.add(new ModelRendererTurbo(seats, 925, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1037")
		);
		seats.add(new ModelRendererTurbo(seats, 728, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-7.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1038")
		);
		seats.add(new ModelRendererTurbo(seats, 317, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(-29.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1040")
		);
		seats.add(new ModelRendererTurbo(seats, 375, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(-20.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1041")
		);
		seats.add(new ModelRendererTurbo(seats, 164, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1049")
		);
		seats.add(new ModelRendererTurbo(seats, 83, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(1.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1050")
		);
		seats.add(new ModelRendererTurbo(seats, 327, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(3.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1051")
		);
		seats.add(new ModelRendererTurbo(seats, 183, 180, textureX, textureY).addBox(0, 0, 0, 26, 10, 13)
			.setRotationPoint(-5.5f, -31, 11).setRotationAngle(0, 0, 0).setName("Box 1104")
		);
		seats.add(new ModelRendererTurbo(seats, 359, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1025")
		);
		seats.add(new ModelRendererTurbo(seats, 470, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1026")
		);
		seats.add(new ModelRendererTurbo(seats, 490, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-32.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1039")
		);
		seats.add(new ModelRendererTurbo(seats, 440, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1042")
		);
		seats.add(new ModelRendererTurbo(seats, 811, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1052")
		);
		seats.add(new ModelRendererTurbo(seats, 72, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-29.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1053")
		);
		seats.add(new ModelRendererTurbo(seats, 309, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-31.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1054")
		);
		seats.add(new ModelRendererTurbo(seats, 920, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-48.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 1087")
		);
		seats.add(new ModelRendererTurbo(seats, 245, 194, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(-48.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1088")
		);
		seats.add(new ModelRendererTurbo(seats, 989, 164, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 1089")
		);
		seats.add(new ModelRendererTurbo(seats, 327, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-49.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1090")
		);
		seats.add(new ModelRendererTurbo(seats, 703, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-37.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 1091")
		);
		seats.add(new ModelRendererTurbo(seats, 139, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 1092")
		);
		seats.add(new ModelRendererTurbo(seats, 835, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 1093")
		);
		seats.add(new ModelRendererTurbo(seats, 927, 249, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 1094")
		);
		seats.add(new ModelRendererTurbo(seats, 604, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-40.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 1095")
		);
		seats.add(new ModelRendererTurbo(seats, 1016, 248, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-38.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 1096")
		);
		seats.add(new ModelRendererTurbo(seats, 530, 222, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(-37.5f, -36, 11).setRotationAngle(0, 0, 0).setName("Box 1100")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 182, textureX, textureY).addBox(0, 0, 0, 26, 10, 19)
			.setRotationPoint(-47.5f, -31, -22).setRotationAngle(0, 0, 0).setName("Box 1102")
		);
		seats.add(new ModelRendererTurbo(seats, 29, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-49.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1067")
		);
		seats.add(new ModelRendererTurbo(seats, 72, 182, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(-48.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1068")
		);
		seats.add(new ModelRendererTurbo(seats, 164, 180, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-48.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1069")
		);
		seats.add(new ModelRendererTurbo(seats, 989, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1070")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-40.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1071")
		);
		seats.add(new ModelRendererTurbo(seats, 419, 251, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-37.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1072")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1073")
		);
		seats.add(new ModelRendererTurbo(seats, 964, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-38.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1074")
		);
		seats.add(new ModelRendererTurbo(seats, 957, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1075")
		);
		seats.add(new ModelRendererTurbo(seats, 941, 250, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1076")
		);
		seats.add(new ModelRendererTurbo(seats, 745, 183, textureX, textureY).addBox(0, 0, 0, 26, 10, 13)
			.setRotationPoint(-47.5f, -31, 11).setRotationAngle(0, 0, 0).setName("Box 1099")
		);
		seats.add(new ModelRendererTurbo(seats, 593, 196, textureX, textureY).addBox(0, 0, 0, 11, 10, 19)
			.setRotationPoint(77.5f, -31, -22).setRotationAngle(0, 0, 0).setName("Box 1115")
		);
		seats.add(new ModelRendererTurbo(seats, 156, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 957")
		);
		seats.add(new ModelRendererTurbo(seats, 847, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(62.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 958")
		);
		seats.add(new ModelRendererTurbo(seats, 654, 206, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(53.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 959")
		);
		seats.add(new ModelRendererTurbo(seats, 133, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 960")
		);
		seats.add(new ModelRendererTurbo(seats, 97, 206, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(75.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 963")
		);
		seats.add(new ModelRendererTurbo(seats, 621, 292, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(74.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 964")
		);
		seats.add(new ModelRendererTurbo(seats, 876, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 965")
		);
		seats.add(new ModelRendererTurbo(seats, 58, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 966")
		);
		seats.add(new ModelRendererTurbo(seats, 451, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 967")
		);
		seats.add(new ModelRendererTurbo(seats, 414, 289, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(86.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 968")
		);
		seats.add(new ModelRendererTurbo(seats, 623, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(85.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 969")
		);
		seats.add(new ModelRendererTurbo(seats, 864, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(83.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 970")
		);
		seats.add(new ModelRendererTurbo(seats, 91, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 972")
		);
		seats.add(new ModelRendererTurbo(seats, 225, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(75.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 973")
		);
		seats.add(new ModelRendererTurbo(seats, 726, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1005")
		);
		seats.add(new ModelRendererTurbo(seats, 452, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1006")
		);
		seats.add(new ModelRendererTurbo(seats, 1016, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1007")
		);
		seats.add(new ModelRendererTurbo(seats, 465, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(53.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1010")
		);
		seats.add(new ModelRendererTurbo(seats, 891, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(62.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1011")
		);
		seats.add(new ModelRendererTurbo(seats, 172, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(50.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 953")
		);
		seats.add(new ModelRendererTurbo(seats, 135, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 954")
		);
		seats.add(new ModelRendererTurbo(seats, 891, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 961")
		);
		seats.add(new ModelRendererTurbo(seats, 176, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 962")
		);
		seats.add(new ModelRendererTurbo(seats, 502, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 994")
		);
		seats.add(new ModelRendererTurbo(seats, 113, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(85.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 995")
		);
		seats.add(new ModelRendererTurbo(seats, 996, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(75.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 996")
		);
		seats.add(new ModelRendererTurbo(seats, 431, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(86.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 997")
		);
		seats.add(new ModelRendererTurbo(seats, 288, 269, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 998")
		);
		seats.add(new ModelRendererTurbo(seats, 502, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(75.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 999")
		);
		seats.add(new ModelRendererTurbo(seats, 521, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(74.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1000")
		);
		seats.add(new ModelRendererTurbo(seats, 811, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1001")
		);
		seats.add(new ModelRendererTurbo(seats, 490, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(83.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1002")
		);
		seats.add(new ModelRendererTurbo(seats, 106, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(85.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1003")
		);
		seats.add(new ModelRendererTurbo(seats, 969, 268, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(50.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1008")
		);
		seats.add(new ModelRendererTurbo(seats, 994, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1009")
		);
		seats.add(new ModelRendererTurbo(seats, 643, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1012")
		);
		seats.add(new ModelRendererTurbo(seats, 438, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(53.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1013")
		);
		seats.add(new ModelRendererTurbo(seats, 686, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(51.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1014")
		);
		seats.add(new ModelRendererTurbo(seats, 842, 215, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(45.5f, -36, -11).setRotationAngle(0, 0, 0).setName("Box 1107")
		);
		seats.add(new ModelRendererTurbo(seats, 813, 215, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(45.5f, -36, 11).setRotationAngle(0, 0, 0).setName("Box 1109")
		);
		seats.add(new ModelRendererTurbo(seats, 901, 185, textureX, textureY).addBox(0, 0, 0, 11, 10, 13)
			.setRotationPoint(77.5f, -31, 11).setRotationAngle(0, 0, 0).setName("Box 1116")
		);
		seats.add(new ModelRendererTurbo(seats, 78, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(21.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 980")
		);
		seats.add(new ModelRendererTurbo(seats, 536, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(34.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 984")
		);
		seats.add(new ModelRendererTurbo(seats, 864, 273, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(33.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 985")
		);
		seats.add(new ModelRendererTurbo(seats, 530, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 986")
		);
		seats.add(new ModelRendererTurbo(seats, 874, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(34.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 987")
		);
		seats.add(new ModelRendererTurbo(seats, 557, 255, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 988")
		);
		seats.add(new ModelRendererTurbo(seats, 802, 278, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(45.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 989")
		);
		seats.add(new ModelRendererTurbo(seats, 487, 274, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 990")
		);
		seats.add(new ModelRendererTurbo(seats, 186, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 991")
		);
		seats.add(new ModelRendererTurbo(seats, 542, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(44.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 992")
		);
		seats.add(new ModelRendererTurbo(seats, 509, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(42.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 993")
		);
		seats.add(new ModelRendererTurbo(seats, 164, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1018")
		);
		seats.add(new ModelRendererTurbo(seats, 387, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1019")
		);
		seats.add(new ModelRendererTurbo(seats, 569, 253, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1020")
		);
		seats.add(new ModelRendererTurbo(seats, 699, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(21.5f, -32, 13).setRotationAngle(0, 0, 0).setName("Box 1031")
		);
		seats.add(new ModelRendererTurbo(seats, 391, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(12.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1032")
		);
		seats.add(new ModelRendererTurbo(seats, 92, 176, textureX, textureY).addBox(0, 0, 0, 26, 10, 19)
			.setRotationPoint(35.5f, -31, -22).setRotationAngle(0, 0, 0).setName("Box 1110")
		);
		seats.add(new ModelRendererTurbo(seats, 601, 282, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(9.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 974")
		);
		seats.add(new ModelRendererTurbo(seats, 115, 281, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 975")
		);
		seats.add(new ModelRendererTurbo(seats, 616, 261, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(10.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 976")
		);
		seats.add(new ModelRendererTurbo(seats, 410, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(12.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 977")
		);
		seats.add(new ModelRendererTurbo(seats, 202, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 978")
		);
		seats.add(new ModelRendererTurbo(seats, 166, 204, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(12.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 979")
		);
		seats.add(new ModelRendererTurbo(seats, 572, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 981")
		);
		seats.add(new ModelRendererTurbo(seats, 710, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 3, 0, 0, -3, 0, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 982")
		);
		seats.add(new ModelRendererTurbo(seats, 314, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 3, 0, 0, -3, 0, 0, -2, -1, 0, 2, -1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 983")
		);
		seats.add(new ModelRendererTurbo(seats, 937, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(34.5f, -32, 21).setRotationAngle(0, 0, 0).setName("Box 1015")
		);
		seats.add(new ModelRendererTurbo(seats, 431, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.5f, -37, 21).setRotationAngle(0, 0, 0).setName("Box 1016")
		);
		seats.add(new ModelRendererTurbo(seats, 122, 257, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.5f, -44, 21).setRotationAngle(0, 0, 0).setName("Box 1017")
		);
		seats.add(new ModelRendererTurbo(seats, 300, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(45.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1027")
		);
		seats.add(new ModelRendererTurbo(seats, 957, 260, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1028")
		);
		seats.add(new ModelRendererTurbo(seats, 428, 203, textureX, textureY).addBox(0, 0, 0, 9, 1, 9)
			.setRotationPoint(34.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1029")
		);
		seats.add(new ModelRendererTurbo(seats, 864, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(33.5f, -32, 12).setRotationAngle(0, 0, 0).setName("Box 1030")
		);
		seats.add(new ModelRendererTurbo(seats, 670, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(9.5f, -37, 12).setRotationAngle(0, 0, 0).setName("Box 1033")
		);
		seats.add(new ModelRendererTurbo(seats, 643, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 9, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, -44, 12).setRotationAngle(0, 0, 0).setName("Box 1034")
		);
		seats.add(new ModelRendererTurbo(seats, 643, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1043")
		);
		seats.add(new ModelRendererTurbo(seats, 347, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(42.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1044")
		);
		seats.add(new ModelRendererTurbo(seats, 368, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(44.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1045")
		);
		seats.add(new ModelRendererTurbo(seats, 937, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -32, 10).setRotationAngle(0, 0, 0).setName("Box 1046")
		);
		seats.add(new ModelRendererTurbo(seats, 300, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(12.5f, -37, 10).setRotationAngle(0, 0, 0).setName("Box 1047")
		);
		seats.add(new ModelRendererTurbo(seats, 334, 252, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(10.5f, -44, 10).setRotationAngle(0, 0, 0).setName("Box 1048")
		);
		seats.add(new ModelRendererTurbo(seats, 863, 221, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(4.5f, -36, -11).setRotationAngle(0, 0, 0).setName("Box 1103")
		);
		seats.add(new ModelRendererTurbo(seats, 142, 217, textureX, textureY).addBox(0, 0, 0, 6, 5, 8)
			.setRotationPoint(4.5f, -36, 11).setRotationAngle(0, 0, 0).setName("Box 1105")
		);
		seats.add(new ModelRendererTurbo(seats, 562, 118, textureX, textureY).addBox(0, 0, 0, 26, 10, 13)
			.setRotationPoint(35.5f, -31, 11).setRotationAngle(0, 0, 0).setName("Box 1108")
		);
		seats.add(new ModelRendererTurbo(seats, 572, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-6.5f, -32, -4).setRotationAngle(0, 0, 0).setName("Box 1444")
		);
		seats.add(new ModelRendererTurbo(seats, 760, 207, textureX, textureY).addBox(0, 0, 0, 9, 1, 17)
			.setRotationPoint(-6.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1445")
		);
		seats.add(new ModelRendererTurbo(seats, 303, 297, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-7.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 1446")
		);
		seats.add(new ModelRendererTurbo(seats, 530, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 2, 0, -2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.5f, -32, -23).setRotationAngle(0, 0, 0).setName("Box 1447")
		);
		seats.add(new ModelRendererTurbo(seats, 533, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -2, 0, 0, 2, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(1.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 1448")
		);
		seats.add(new ModelRendererTurbo(seats, 822, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(4.5f, -37, -21).setRotationAngle(0, 0, 0).setName("Box 1449")
		);
		seats.add(new ModelRendererTurbo(seats, 521, 259, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, -3, 0, 0, 3, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, -37, -4).setRotationAngle(0, 0, 0).setName("Box 1450")
		);
		seats.add(new ModelRendererTurbo(seats, 740, 264, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -3, 0, 0, 3, 0, 0, 2, -1, 0, -2, -1, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5f, -44, -4).setRotationAngle(0, 0, 0).setName("Box 1451")
		);
		seats.add(new ModelRendererTurbo(seats, 507, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 17, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, -44, -21).setRotationAngle(0, 0, 0).setName("Box 1452")
		);
		seats.add(new ModelRendererTurbo(seats, 375, 263, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, -2, -1, 0, 2, -1, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(3.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 1453")
		);
		seats.add(new ModelRendererTurbo(seats, 283, 295, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 17, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(-20.5f, -32, -21).setRotationAngle(0, 0, 0).setName("Box 925")
		);
		seats.add(new ModelRendererTurbo(seats, 654, 176, textureX, textureY).addBox(0, 0, 0, 26, 10, 19)
			.setRotationPoint(-5.5f, -31, -22).setRotationAngle(0, 0, 0).setName("Box 1106")
		);
		seats.add(new ModelRendererTurbo(seats, 903, 258, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 2, 0, 2, 0, 0, -2, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(53.5f, -37, -23).setRotationAngle(0, 0, 0).setName("Box 955")
		);
		seats.add(new ModelRendererTurbo(seats, 368, 262, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 2, 0, 2, -1, 0, -2, -1, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(51.5f, -44, -23).setRotationAngle(0, 0, 0).setName("Box 956")
		);
		seats.add(new ModelRendererTurbo(seats, 0, 248, textureX, textureY).addBox(0, 0, 0, 2, 17, 24)
			.setRotationPoint(88, -38, -23).setRotationAngle(0, 0, 0).setName("Box 691")
		);
		seats.add(new ModelRendererTurbo(seats, 587, 244, textureX, textureY).addBox(0, 0, 0, 2, 17, 12)
			.setRotationPoint(88, -38, 11).setRotationAngle(0, 0, 0).setName("Box 1004")
		);
		seats.add(new ModelRendererTurbo(seats, 835, 244, textureX, textureY).addBox(0, 0, 0, 2, 38, 12)
			.setRotationPoint(-80, -59, 10).setRotationAngle(0, 0, 0).setName("Box 1056")
		);
		seats.add(new ModelRendererTurbo(seats, 384, 245, textureX, textureY).addBox(0, 0, 0, 2, 38, 21)
			.setRotationPoint(-80, -59, -23).setRotationAngle(0, 0, 0).setName("Box 1097")
		);
		seats.add(new ModelRendererTurbo(seats, 159, 244, textureX, textureY).addBox(0, 0, 0, 2, 5, 12)
			.setRotationPoint(-80, -59, -2).setRotationAngle(0, 0, 0).setName("Box 1098")
		);
		this.groups.add(seats);
		//
	}

}
