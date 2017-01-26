package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_321 {
    private final Production82_321 production = new Production82_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}