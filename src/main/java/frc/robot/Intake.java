/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Add your docs here.
 */
public class Intake {

    private Spark intakeMotor;
    public double intakeSpeed = 0.8;

    public Intake()
    {
        intakeMotor = new Spark(6);
    }
    public void ballIntake()
    {
        intakeMotor.set(intakeSpeed);
    }
    public void ballOuttake()
    {
        intakeMotor.set(-intakeSpeed);
    }
    public void intakeStop()
    {
        intakeMotor.set(0);
    }

}
