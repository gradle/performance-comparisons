package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_352 {
    private final Production82_352 production = new Production82_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}