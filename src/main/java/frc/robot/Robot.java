/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

/**
 * This is a demo program showing the use of the DifferentialDrive class.
 * Runs the motors with arcade steering.
 */
public class Robot extends TimedRobot {
  public static OI oi;
  public static DriveTrain drivetrain;
  public static Intake intake;



  @Override
  public void robotInit() {
  oi = new OI();
  drivetrain = new DriveTrain();
  intake = new Intake();
  }


  @Override
  public void teleopPeriodic() {
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    //robotDriveFront.arcadeDrive(m_stick.getY(), m_stick.getX());
    //leftFrontMotor.setSafetyEnabled(true);
    drivetrain.driveWithJoysticks(Robot.oi.xBox.getX(), -Robot.oi.xBox.getY(), 0.85);
    
    //robotDriveBack.arcadeDrive(m_stick.getY(), m_stick.getX());
  }
}
