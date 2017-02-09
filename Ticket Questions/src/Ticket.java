public abstract class Ticket {
	private int number;
	private int daysBeforeEvent;
//	private static int getNextNum(number){
//		this.number = number + 1;
//	}
	public Ticket(int number){
		//this.number = getNextNum(number);
		this.number = number;
	}
	public abstract double getPrice();
	public String toString(){
		return "Number: " + number + ", Price: " + getPrice();
	}
}