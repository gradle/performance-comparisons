package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_123 {
    private final Production82_123 production = new Production82_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}