package strategy;

public class Porcentaje implements StrategyOperation{
	public int operate(int a, int b) {
		int result;
		Calculator calc_2 = new Calculator();
		calc_2.register("*", new Multiplicacion());
		result = calc_2.execute("*", a, b/100);
		return result;
	}

}
