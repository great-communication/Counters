import java.util.List;
import java.util.ArrayList;

public class CounterManager {	
	private List<Counter> counters;
	
	CounterManager(){
		counters = new ArrayList<Counter>();
	}
	
	public void createCounter(String name, int value) {
		Counter counter = new Counter(name, value);
		counters.add(counter);			
	}
	
	public List<NameAndValue> getAllCounters() {	
		List<NameAndValue> NameAndValue = new ArrayList<NameAndValue>();
		for (int i = 0; i < counters.size(); i++) {
			NameAndValue.add(new NameAndValue(counters.get(i).getName(), counters.get(i).getValue())); 
		}
		
		return NameAndValue;		
	}
	
	public int getValue(String counterName) throws InvalidCounterNameException {
		for (int i = 0; i < counters.size(); i++) {
			if(counters.get(i).getName() == counterName) {
				return counters.get(i).getValue();
			}
		}
		
		throw new InvalidCounterNameException("Invalid counter name.");
	}
	
	public boolean incrementCounter(String counterName) {
		for (int i = 0; i < counters.size(); i++) {
			if(counters.get(i).getName() == counterName) {
				counters.get(i).Increment();
				return true;
			}
		}	
		
		return false;
	}
}
