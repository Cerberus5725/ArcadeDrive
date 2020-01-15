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

    public Intake()
    {
        intakeMotor = new Spark(6);
    }
    public Command ballIntake()
    {
        intakeMotor.set(1.0);
        return null;
    }
    public Command ballOuttake()
    {
        intakeMotor.set(-1.0);
        return null;
    }

}
