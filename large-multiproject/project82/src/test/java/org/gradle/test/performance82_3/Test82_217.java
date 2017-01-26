package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_217 {
    private final Production82_217 production = new Production82_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}