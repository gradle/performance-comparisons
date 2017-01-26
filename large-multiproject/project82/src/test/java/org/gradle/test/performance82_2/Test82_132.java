package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_132 {
    private final Production82_132 production = new Production82_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}