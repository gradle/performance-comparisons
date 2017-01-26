package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_298 {
    private final Production82_298 production = new Production82_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}