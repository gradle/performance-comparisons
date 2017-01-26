package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_23 {
    private final Production82_23 production = new Production82_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}