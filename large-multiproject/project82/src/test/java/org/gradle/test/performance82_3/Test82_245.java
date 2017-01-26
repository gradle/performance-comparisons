package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_245 {
    private final Production82_245 production = new Production82_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}