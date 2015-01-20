public class Demo {

	private int firstnumber;
	private int lastnumber;
	
	public Test1(int firstnumber,int lastnumber){
		this.firstnumber = firstnumber;
		this.lastnumber = lastnumber;
	}
	public int substractNumbers(){
		return firstnumber - lastnumber;
	}
	
	public int multiplyNumbers(){
		return firstnumber*lastnumber;
	}
	
	public int devideNumbers(){
		return firstnumber/lastnumber;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Class ");
	}
}
