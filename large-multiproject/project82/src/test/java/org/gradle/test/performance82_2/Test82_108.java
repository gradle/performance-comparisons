package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_108 {
    private final Production82_108 production = new Production82_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}