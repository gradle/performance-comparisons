package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_115 {
    private final Production82_115 production = new Production82_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}