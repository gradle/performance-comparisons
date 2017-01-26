package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_194 {
    private final Production82_194 production = new Production82_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}