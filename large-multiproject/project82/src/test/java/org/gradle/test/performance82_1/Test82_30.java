package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_30 {
    private final Production82_30 production = new Production82_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}