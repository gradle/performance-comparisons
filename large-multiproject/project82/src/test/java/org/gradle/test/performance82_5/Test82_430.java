package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_430 {
    private final Production82_430 production = new Production82_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}