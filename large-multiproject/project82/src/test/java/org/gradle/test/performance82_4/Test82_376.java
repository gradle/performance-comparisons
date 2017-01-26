package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_376 {
    private final Production82_376 production = new Production82_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}