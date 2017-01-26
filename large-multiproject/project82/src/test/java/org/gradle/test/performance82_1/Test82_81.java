package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_81 {
    private final Production82_81 production = new Production82_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}