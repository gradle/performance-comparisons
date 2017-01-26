package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_277 {
    private final Production82_277 production = new Production82_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}