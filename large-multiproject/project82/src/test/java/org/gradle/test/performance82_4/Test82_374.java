package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_374 {
    private final Production82_374 production = new Production82_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}