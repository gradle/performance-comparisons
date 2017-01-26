package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_456 {
    private final Production82_456 production = new Production82_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}