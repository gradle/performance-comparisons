package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_295 {
    private final Production82_295 production = new Production82_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}