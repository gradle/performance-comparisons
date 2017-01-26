package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_83 {
    private final Production82_83 production = new Production82_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}