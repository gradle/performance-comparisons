package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_462 {
    private final Production82_462 production = new Production82_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}