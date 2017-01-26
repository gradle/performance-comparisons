package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_129 {
    private final Production82_129 production = new Production82_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}