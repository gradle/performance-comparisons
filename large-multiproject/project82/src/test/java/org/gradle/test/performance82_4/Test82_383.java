package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_383 {
    private final Production82_383 production = new Production82_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}