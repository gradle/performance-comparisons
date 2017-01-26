package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_494 {
    private final Production82_494 production = new Production82_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}