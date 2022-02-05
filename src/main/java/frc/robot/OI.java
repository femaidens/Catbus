// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.Commands.IntakeCargo;
import frc.robot.Commands.ReleaseShooter;
import frc.robot.Commands.ExtendIntake;
import frc.robot.Commands.RetractIntake;
import frc.robot.Commands.WindShooter;


/** Add your docs here. */
public class OI {

    public static Joystick driveJoy1 = new Joystick(RobotMap.driveJoy1Port);
    public static Joystick driveJoy2 = new Joystick(RobotMap.driveJoy2Port);
    public static Joystick operJoy = new Joystick(RobotMap.operJoyPort);

    public static Button intakeMotorButton = new JoystickButton(operJoy, 1);
    public static Button intakeExtendButton = new JoystickButton(operJoy, 2);
    public static Button intakeRetractButton = new JoystickButton(operJoy, 3);

    public static Button shooterButtonWind = new JoystickButton(operJoy, 4);
    public static Button shooterButtonShoot = new JoystickButton(operJoy, 5);

    public void bindButtons() {
        intakeMotorButton.whileHeld(new IntakeCargo());
        intakeExtendButton.whenPressed(new ExtendIntake());
        intakeRetractButton.whenPressed(new RetractIntake());
        shooterButtonWind.whenPressed(new WindShooter());
        shooterButtonShoot.whenPressed(new ReleaseShooter());
    }

}
