package primitivo.mutable;

/**
 * Mutable wrapper of a {@code char} value.
 * Provides a mutable alternative to {@link Character}.
 * <p>
 * By design, this class is not a subtype of
 * {@link MutableObject MutableObject&lt;Character&gt;},
 * but it may be converted into this type
 * using {@link MutableObject#of(MutableChar)}.
 *
 * @author Michael Bisgaard Olesen
 *
 * @see primitivo.mutable
 */

public class MutableChar implements Comparable<MutableChar> {
	private char value;
	
	public MutableChar(char value) {
		set(value);
	}
	
	public static MutableChar of(char value) {
		return new MutableChar(value);
	}
	
	public char get() {
		return value;
	}
	
	public void set(char character) {
		this.value = character;
	}
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public void add(char value) {
		this.value += value;
	}
	
	public void subtract(char value) {
		this.value -= value;
	}
	
	public void multiply(char value) {
		this.value *= value;
	}
	
	public void divide(char value) {
		this.value /= value;
	}
	
	public void negate() {
		value = (char) ~value;
	}
	
	public void and(char value) {
		this.value &= value;
	}
	
	public void or(char value) {
		this.value |= value;
	}
	
	public void xor(char value) {
		this.value ^= value;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		
		MutableChar other = (MutableChar) object;
		return value == other.value;
	}
	
	@Override
	public int hashCode() {
		return value;
	}
	
	//@Override
	public int compareTo(MutableChar other) {
		return value - other.value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
