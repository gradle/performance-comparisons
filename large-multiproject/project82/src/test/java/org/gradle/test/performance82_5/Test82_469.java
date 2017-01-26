package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_469 {
    private final Production82_469 production = new Production82_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}