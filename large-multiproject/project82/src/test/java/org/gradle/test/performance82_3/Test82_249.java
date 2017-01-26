package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_249 {
    private final Production82_249 production = new Production82_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}