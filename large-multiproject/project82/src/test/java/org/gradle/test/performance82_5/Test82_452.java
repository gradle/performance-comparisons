package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_452 {
    private final Production82_452 production = new Production82_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}