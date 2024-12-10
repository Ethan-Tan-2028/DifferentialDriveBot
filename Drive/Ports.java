package robot;
package robot.drive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import robot.Ports;

public class Drive extends SubsystemBase {

}
public final class Ports {
  // TODO: Add and change all ports as needed.
  public static final class OI {
    public static final int OPERATOR = 0;
    public static final int DRIVER = 1;
  }
  public static final class Drive {
    public static final int LEFT_LEADER = 1;
    public static final int LEFT_FOLLOWER = 2;
    public static final int RIGHT_LEADER = 3;
    public static final int RIGHT_FOLLOWER = 4;
  }

}
