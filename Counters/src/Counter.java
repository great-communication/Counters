
public class Counter {
	private String name;
	private int value;
	
	public Counter(String name, int value) {
		this.name = name;
		this.value = value;
	}	

	public void Increment() {
		value++;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
}
