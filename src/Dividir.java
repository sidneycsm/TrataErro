
public class Dividir {

	@SuppressWarnings("finally")
	public String dividindo(int valorA, int valorB) throws ArithmeticException {

		String msgErro = " ";
		try {
			msgErro = String.valueOf(valorA / valorB);

		} catch (ArithmeticException e) {
			msgErro = "Erro de divisão por zeros - Reveja seus números";
		} catch (Exception e) {

			msgErro = "Erro Genérico - Reveja seus números <> " + e;

		}

		finally {

			return msgErro;
		}

	}

}
