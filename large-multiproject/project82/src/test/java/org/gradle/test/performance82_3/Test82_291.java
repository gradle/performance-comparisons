package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_291 {
    private final Production82_291 production = new Production82_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}