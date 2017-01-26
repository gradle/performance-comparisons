package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_130 {
    private final Production82_130 production = new Production82_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}