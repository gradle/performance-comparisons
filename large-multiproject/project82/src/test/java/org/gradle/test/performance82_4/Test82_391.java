package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_391 {
    private final Production82_391 production = new Production82_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}