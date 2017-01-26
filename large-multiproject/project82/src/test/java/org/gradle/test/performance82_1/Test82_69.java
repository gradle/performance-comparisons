package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_69 {
    private final Production82_69 production = new Production82_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}