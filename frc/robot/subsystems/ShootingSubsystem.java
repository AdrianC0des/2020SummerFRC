/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ShootingCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class ShootingSubsystem extends Subsystem {

  public VictorSPX shootingMotor = new VictorSPX(RobotMap.shootingMotor);
  public static double SetSpeed;

  /**
   * Creates a new ShootingSubsystem.
   */
  public ShootingSubsystem() {
    SetSpeed = 0.8;

  }

  //Change the speed of the spin
  public void spin(double percent) {
    shootingMotor.set(ControlMode.PercentOutput, .80);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub
    setDefaultCommand(new ShootingCommand());

  }

  private void setDefaultCommand(ShootingCommand ShootingCommand) {
  }
}
