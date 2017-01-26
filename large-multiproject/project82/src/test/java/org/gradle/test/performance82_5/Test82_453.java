package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_453 {
    private final Production82_453 production = new Production82_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}