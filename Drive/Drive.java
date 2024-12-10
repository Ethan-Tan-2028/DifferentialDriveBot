import.List
public class Drive extends SubsystemBase {  
  private final CANSparkMax leftLeader = new CANSparkMax(Ports.Drive.LEFT_LEADER, MotorType.kBrushless);
  private final CANSparkMax leftfollower = new CANSparkMax(Ports.Drive.LEFT_FOLLOWER, MotorType.kBrushless);
  private final CANSparkMax rightLeader = new CANSparkMax(Ports.Drive.RIGHT_LEADER, MotorType.kBrushless);
  private final CANSparkMax rightfollower = new CANSparkMax(Ports.Drive.RIGHT_FOLLOWER, MotorType.kBrushless);

    public Drive() {
    for (CANSparkMax spark : List.of(leftLeader, leftFollower, rightLeader, rightFollower)) {
	    spark.restoreFactoryDefaults();
      spark.setIdleMode(IdleMode.kBrake);

    }
    rightFollower.follow(rightLeader);
    leftFollower.follow(leftLeader);
    leftLeader.setInverted(true);
	  rightLeader.setInverted(true);

  }

}

