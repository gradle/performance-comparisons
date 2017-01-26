package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_363 {
    private final Production82_363 production = new Production82_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}