import java.util.Optional;

public class LearnOptional {
	
	private Optional<Integer> value;

	public Optional<Integer> getValue() {
		return value;
	}

	public void setValue(Integer value) {
	    this.value = Optional.ofNullable(value);
	}
	
	public Optional<Integer> getChangedValue(){
		return value.map(x -> 2*x);	
		}
	
	public static void main(String[] args) {
		LearnOptional learnOptional = new LearnOptional();
		learnOptional.setValue(4);
		learnOptional.getChangedValue().ifPresent(value -> System.out.println(value));
	}

}
