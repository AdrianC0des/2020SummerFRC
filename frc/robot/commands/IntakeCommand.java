/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.GenericHID;

public class IntakeCommand extends Command {
  public IntakeCommand() {
    // Use requires() here to declare subsystem dependencies
    System.out.println("IntakeCommand Initialization, get ready to shoot...");
    requires(Robot.intakeSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
	  super.initialize(); 
    //Robot.intakeSubsystem.setSpeed(-1); 
  }

  // Called repeatedly when this Command is scheduled to run
  //Experimental as well 
  @Override
  protected void execute() {
    //OI.intakeButton.whileHeld(Robot.intakeSubsystem.intakeMotor.set(ControlMode.PercentOutput, .75));
    Robot.intakeSubsystem.intakeMotor.set(ControlMode.PercentOutput, .75);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() { 
   // return OI.getRawButton(RobotMap.intakeMotor) == false; 
   return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() { 
    super.end();
    //the spin stops
    Robot.intakeSubsystem.spin(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    super.interrupted();
  }
}
