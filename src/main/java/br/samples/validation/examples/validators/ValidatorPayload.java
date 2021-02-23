package br.samples.validation.examples.validators;

import br.com.fluentvalidator.AbstractValidator;
import br.samples.validation.examples.PayLoad;
import br.samples.validation.examples.Person;

import static br.com.fluentvalidator.predicate.ObjectPredicate.nullValue;
import static br.com.fluentvalidator.predicate.LogicalPredicate.*;

public class ValidatorPayload extends AbstractValidator<PayLoad> {

    @Override
    public void rules() {

        ruleForEach(x -> x.getData())
                .whenever(not(nullValue()))
                .withValidator(new ValidatorPerson());

    }
}
