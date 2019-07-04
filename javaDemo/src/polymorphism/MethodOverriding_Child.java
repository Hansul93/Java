package polymorphism;

public class MethodOverriding_Child extends MethodOverriding_Parent {

	// This method overrides show() of Parent
	@Override
	int salary() {
		return base + 20000;
	}
}
