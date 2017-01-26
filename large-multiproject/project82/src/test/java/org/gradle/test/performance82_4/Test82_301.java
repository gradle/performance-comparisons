package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_301 {
    private final Production82_301 production = new Production82_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}