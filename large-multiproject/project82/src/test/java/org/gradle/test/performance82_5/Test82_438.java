package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_438 {
    private final Production82_438 production = new Production82_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}