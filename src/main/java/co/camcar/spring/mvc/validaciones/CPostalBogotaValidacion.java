package co.camcar.spring.mvc.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalBogotaValidacion implements ConstraintValidator<CPostalBogota, String> {
	
	private String prefijoCodigoBogota;

	@Override
	public void initialize(CPostalBogota prefijoCodigoBogota) {
		// TODO Auto-generated method stub
		this.prefijoCodigoBogota = prefijoCodigoBogota.value();
	}

	@Override
	public boolean isValid(String codigoPostal, ConstraintValidatorContext validatorContext) {
		// TODO Auto-generated method stub
		if(codigoPostal!=null) {
			return codigoPostal.startsWith(prefijoCodigoBogota);
		}
		return true;
	}
}