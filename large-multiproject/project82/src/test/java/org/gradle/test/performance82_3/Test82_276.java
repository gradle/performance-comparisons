package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_276 {
    private final Production82_276 production = new Production82_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}