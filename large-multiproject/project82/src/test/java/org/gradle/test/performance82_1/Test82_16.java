package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_16 {
    private final Production82_16 production = new Production82_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}