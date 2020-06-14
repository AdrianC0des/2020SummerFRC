/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive_Command;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  
  // Instantiate new motor controller objects with SpeedController
  private Spark leftFrontMotor = new Spark(RobotMap.leftFrontMotor);
  private Spark leftRearMotor = new Spark(RobotMap.leftRearMotor);
  private SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontMotor, leftRearMotor);


  private Spark rightFrontMotor = new Spark(RobotMap.rightFrontMotor);
  private Spark rightRearMotor = new Spark(RobotMap.rightRearMotor);
  private SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);

  // Instantiate a new DifferentialDrive object and assign the SpeedControllerGroups 
  private DifferentialDrive drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
  
  //teleOp
  public void tankDrive (double leftMotorGroup, double rightMotorGroup) {
    drive.tankDrive(leftMotorGroup, rightMotorGroup);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TeleopDrive_Command());
  }
}
