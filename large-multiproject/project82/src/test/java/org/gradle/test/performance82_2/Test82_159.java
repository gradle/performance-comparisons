package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_159 {
    private final Production82_159 production = new Production82_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}