package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_433 {
    private final Production82_433 production = new Production82_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}