package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_184 {
    private final Production82_184 production = new Production82_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}