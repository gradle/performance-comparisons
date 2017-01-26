package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_33 {
    private final Production82_33 production = new Production82_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}