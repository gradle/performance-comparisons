package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_128 {
    private final Production82_128 production = new Production82_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}