package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_479 {
    private final Production82_479 production = new Production82_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}