package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_131 {
    private final Production82_131 production = new Production82_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}