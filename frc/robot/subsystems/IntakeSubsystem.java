/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;


public class IntakeSubsystem extends Subsystem {

  public VictorSPX intakeMotor = new VictorSPX(RobotMap.intakeMotor);
  public static double setSpeed;


  /**
   * Creates a new IntakeSubsystem. This is for the low intake system.
   */
  public IntakeSubsystem() {
    setSpeed = 0.8;
    }

  public void spin(double percent) {
      intakeMotor.set(ControlMode.PercentOutput, percent);
  }
 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new IntakeCommand());
  }

  //private void setDefaultCommand(IntakeCommand intake_Command) {
  
}
