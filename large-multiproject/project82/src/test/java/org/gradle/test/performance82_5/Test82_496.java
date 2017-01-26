package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_496 {
    private final Production82_496 production = new Production82_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}