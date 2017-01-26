package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_19 {
    private final Production82_19 production = new Production82_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}