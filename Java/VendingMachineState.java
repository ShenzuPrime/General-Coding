public class VendingMachineState {

	private String state="";

	public void setState(String state){
		this.state=state;
	}

	public void doAction(){
		if(state.equalsIgnoreCase("Pay")){
			System.out.println("Please Insert Bill");
		}
		else if(state.equalsIgnoreCase("Choose")){
			System.out.println("Please Choose Item Number");
		}
		else if(state.equalsIgnoreCase("Dispense")){
			System.out.println("Please Collect Your Item");
		}
	}

	public static void main(String args[]){
		VendingMachineState vState = new VendingMachineState();

		vState.setState("Pay");
		vState.doAction();

		vState.setState("Choose");
		vState.doAction();

		vState.setState("Dispense");
		vState.doAction();
	}

}
