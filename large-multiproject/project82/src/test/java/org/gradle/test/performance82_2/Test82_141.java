package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_141 {
    private final Production82_141 production = new Production82_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}