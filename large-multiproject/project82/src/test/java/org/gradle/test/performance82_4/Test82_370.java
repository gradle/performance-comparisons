package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_370 {
    private final Production82_370 production = new Production82_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}