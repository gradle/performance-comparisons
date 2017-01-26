package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_328 {
    private final Production82_328 production = new Production82_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}