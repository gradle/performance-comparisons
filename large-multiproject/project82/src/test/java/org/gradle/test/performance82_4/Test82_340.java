package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_340 {
    private final Production82_340 production = new Production82_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}