package br.samples.validation.examples;

import br.com.fluentvalidator.context.ValidationResult;
import br.samples.validation.examples.validators.ValidatorPayload;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args)
    {
        List<Person> data =  new ArrayList<Person>();
        data.add(new Person("Person1", "31805142000150"));
        data.add(new Person("Person2", "23129893000175"));
        data.add(new Person("Person3", "87819347000149"));

        PayLoad payload =  new PayLoad(data);

        ValidatorPayload validatorPayload  = new ValidatorPayload();
        final ValidationResult result = validatorPayload.validate(payload);

        System.out.println(String.format("Validation %s", result.isValid() ? "is OK" : "is not OK"));
    }
}
