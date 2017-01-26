package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_125 {
    private final Production82_125 production = new Production82_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}