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
  public boolean forward = true;



  @Override
  public void robotInit() {
  oi = new OI();
  drivetrain = new DriveTrain();
  intake = new Intake();
  }


  @Override
  public void teleopPeriodic() {
    drivetrain.driveWithJoysticks(Robot.oi.xBox.getX(), -Robot.oi.xBox.getY());
    if(Robot.oi.xBox.getRawButtonPressed(1))
    {
      if(forward == false)
      {
        intake.intakeStop();
        forward = true;
      }
      intake.ballIntake();
    }
    else if(Robot.oi.xBox.getRawButtonPressed(4))
    {
      if(forward == true)
      {
        intake.intakeStop();
        forward = false;
      }
      intake.ballOuttake();
    }
    else if(Robot.oi.xBox.getRawButtonPressed(2))
    {
        intake.intakeStop();
    }
  }
}
