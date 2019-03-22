
public class Dividir {

	@SuppressWarnings("finally")
	public String dividindo(int valorA, int valorB) throws ArithmeticException {

		String msgErro = " ";
		try {
			msgErro = String.valueOf(valorA / valorB);

		} catch (ArithmeticException e) {
			msgErro = "Erro de divis�o por zeros - Reveja seus n�meros";
		} catch (Exception e) {

			msgErro = "Erro Gen�rico - Reveja seus n�meros <> " + e;

		}

		finally {

			return msgErro;
		}

	}

}
