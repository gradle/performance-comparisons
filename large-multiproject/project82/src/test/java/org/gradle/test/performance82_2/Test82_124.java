package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_124 {
    private final Production82_124 production = new Production82_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}