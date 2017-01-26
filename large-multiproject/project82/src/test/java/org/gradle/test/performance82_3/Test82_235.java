package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_235 {
    private final Production82_235 production = new Production82_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}