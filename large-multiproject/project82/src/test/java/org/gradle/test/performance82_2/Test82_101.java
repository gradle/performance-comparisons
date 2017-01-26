package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_101 {
    private final Production82_101 production = new Production82_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}