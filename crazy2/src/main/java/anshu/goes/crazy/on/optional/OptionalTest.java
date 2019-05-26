package anshu.goes.crazy.on.optional;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		Optional.ofNullable(new Integer(1)).ifPresent(x -> {
			System.out.println("hello");
		});
	}

}
