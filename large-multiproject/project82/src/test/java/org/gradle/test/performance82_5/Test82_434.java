package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_434 {
    private final Production82_434 production = new Production82_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}