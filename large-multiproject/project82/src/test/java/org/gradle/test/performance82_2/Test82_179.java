package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_179 {
    private final Production82_179 production = new Production82_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}