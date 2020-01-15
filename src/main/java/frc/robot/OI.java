

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Add your docs here.
 */
public class OI {
    public JoystickButton ballIntakeButton;
    public JoystickButton ballOuttakeButton;
    public Joystick xBox;

        public OI() {
        xBox = new Joystick(0);
        ballIntakeButton = new JoystickButton(xBox, 1);
        //ballIntakeButton.whileHeld(Robot.intake.ballIntake());
        ballOuttakeButton = new JoystickButton(xBox, 4);
        //ballOuttakeButton.whileHeld(Robot.intake.ballOuttake());
        }

}
