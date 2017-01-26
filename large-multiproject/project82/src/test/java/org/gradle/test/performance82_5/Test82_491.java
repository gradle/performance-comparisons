package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_491 {
    private final Production82_491 production = new Production82_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}