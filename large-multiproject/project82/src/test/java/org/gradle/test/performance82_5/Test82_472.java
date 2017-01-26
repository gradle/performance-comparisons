package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_472 {
    private final Production82_472 production = new Production82_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}