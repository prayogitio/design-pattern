public class RemoteControlTestDrive {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light kitchenLight = new Light("kitchen room");
		LightOnCommand klightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand klightOffCommand = new LightOffCommand(kitchenLight);

		rc.setCommand(0, klightOnCommand, klightOffCommand);

		System.out.println(rc);

		rc.onButtonWasPushed(0);
		rc.offButtonWasPushed(0);
		rc.undoButtonWasPushed();
	}
}