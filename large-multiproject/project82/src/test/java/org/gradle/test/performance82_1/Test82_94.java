package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_94 {
    private final Production82_94 production = new Production82_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}