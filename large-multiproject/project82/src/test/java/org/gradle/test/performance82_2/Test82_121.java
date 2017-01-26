package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_121 {
    private final Production82_121 production = new Production82_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}