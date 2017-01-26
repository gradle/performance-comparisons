package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_411 {
    private final Production82_411 production = new Production82_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}