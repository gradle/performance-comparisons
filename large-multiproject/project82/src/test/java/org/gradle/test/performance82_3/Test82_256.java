package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_256 {
    private final Production82_256 production = new Production82_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}