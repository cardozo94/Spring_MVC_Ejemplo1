package co.camcar.spring.mvc.validaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//la futura calse que contendrá la lógica de la validación
@Constraint(validatedBy=CPostalBogotaValidacion.class)
//destuno de nuestra validación metodos y campos
@Target({ElementType.METHOD, ElementType.FIELD})
//chequea la anotacion en tiempo de ejecución
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalBogota {

	//definir el c postal por defecto
	String value() default "11";
	//definir el mensaje de error
	String message() default "El Código postal debe comenzar por 28";
	//definir los grupos
	Class<?>[] groups() default {};
	//definir los payloads
	Class<? extends Payload>[] payload() default {};
}
