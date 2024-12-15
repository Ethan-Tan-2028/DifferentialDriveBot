public Class Robot{
  public Command drive(DoubleSupplier vLeft, DoubleSupplier vRight) {
  }
    Drive drive = new Drive();
  private void configureBindings() {
	drive.setDefaultCommand(drive.drive(driver::getLeftY, driver::getRightY));
}
}
