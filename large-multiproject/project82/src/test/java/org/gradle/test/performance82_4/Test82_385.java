package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_385 {
    private final Production82_385 production = new Production82_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}