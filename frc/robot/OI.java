/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShootingCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public static Joystick leftJoystick = new Joystick(RobotMap.joystickPort0);
  public static Joystick rightJoystick = new Joystick(RobotMap.joystickPort1);
//gamepad might not be used this year, just left it here in case//
  public static Joystick gamePad = new Joystick(RobotMap.joystickPort2);

  //Intake System Button
  public static Button intakeButton = new JoystickButton(leftJoystick, 1);

  //Shooting System Button
  public static Button shootingButton = new JoystickButton(rightJoystick, 1);


  public OI() {

    JoystickButton intakeButton = new JoystickButton(leftJoystick, RobotMap.intakeMotor);
    intakeButton.whileHeld(new IntakeCommand()); 

    JoystickButton shootingButtonTest = new JoystickButton(rightJoystick, RobotMap.shootingMotor);
    shootingButtonTest.whileHeld(new ShootingCommand());

    //might not work :( // 
    //intakeButton.whileHeld(new IntakeCommand());
    //shootingButton.whileHeld(new ShootingCommand());
  }
}


  
  
  
  
  
  // CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  // joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  
  
  
  
  
  
  
  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  