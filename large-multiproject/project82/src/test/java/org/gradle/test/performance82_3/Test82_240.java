package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_240 {
    private final Production82_240 production = new Production82_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}