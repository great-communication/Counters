
public class Test {

	public static void main(String[] args) throws InvalidCounterNameException {
		
		CounterManager manager = new CounterManager();
		manager.createCounter("c1", 0);
		manager.createCounter("c2", 0);
		manager.incrementCounter("c1");	
		manager.incrementCounter("c2");	
		manager.incrementCounter("c2");	
		manager.incrementCounter("c2");	
		manager.getAllCounters().get(0).getName();		
		
		System.out.println(manager.getValue("c1"));
	}

}
