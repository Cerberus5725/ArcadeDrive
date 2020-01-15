
package frc.robot;

import edu.wpi.first.wpilibj.Spark;

public class DriveTrain {
private Spark leftFrontMotor;
private Spark leftBackMotor;
private Spark rightFrontMotor;
private Spark rightBackMotor;

public double motorSpeed = 0.65;


    public DriveTrain() {
leftFrontMotor = new Spark(0);
leftFrontMotor.setInverted(false);

leftBackMotor = new Spark(1);
leftBackMotor.setInverted(false); 

rightFrontMotor = new Spark(2);
rightFrontMotor.setInverted(false);

rightBackMotor = new Spark(3);
rightBackMotor.setInverted(false);
}

public void driveWithJoysticks(double joystickX, double joystickY)
	{

        double LeftSpeed;
        double RightSpeed;
        LeftSpeed = (joystickX + joystickY) *motorSpeed;
        RightSpeed = (-joystickX + joystickY) *motorSpeed;
        if(LeftSpeed >= 1.0)
        {
            LeftSpeed = 1.0;
        }
        if(RightSpeed >= 1.0)
        {
            RightSpeed = 1.0;
        }
         leftFrontMotor.set(LeftSpeed);
         leftBackMotor.set(LeftSpeed);
         rightFrontMotor.set(RightSpeed);
         rightBackMotor.set(RightSpeed);
    }
    

}
