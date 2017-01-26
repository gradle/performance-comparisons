package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_70 {
    private final Production82_70 production = new Production82_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}