package com.example.sunday;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        final double accountBalance = person.getAccountBalance();

        final Date date = person.getBirthDate();
        final String address = person.getAddress().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName, accountBalance, date, address, accountBalance);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}