package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_470 {
    private final Production82_470 production = new Production82_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}