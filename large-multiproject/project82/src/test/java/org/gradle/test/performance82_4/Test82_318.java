package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_318 {
    private final Production82_318 production = new Production82_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}