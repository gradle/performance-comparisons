package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_375 {
    private final Production82_375 production = new Production82_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}