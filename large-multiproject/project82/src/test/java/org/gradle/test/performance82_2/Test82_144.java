package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_144 {
    private final Production82_144 production = new Production82_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}