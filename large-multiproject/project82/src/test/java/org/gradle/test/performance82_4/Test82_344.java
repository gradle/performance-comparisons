package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_344 {
    private final Production82_344 production = new Production82_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}