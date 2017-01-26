package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_152 {
    private final Production82_152 production = new Production82_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}