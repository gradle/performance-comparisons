package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_478 {
    private final Production82_478 production = new Production82_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}