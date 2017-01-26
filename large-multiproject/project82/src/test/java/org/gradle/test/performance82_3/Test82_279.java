package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_279 {
    private final Production82_279 production = new Production82_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}