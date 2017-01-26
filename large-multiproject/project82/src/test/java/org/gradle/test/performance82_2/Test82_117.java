package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_117 {
    private final Production82_117 production = new Production82_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}