package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_54 {
    private final Production82_54 production = new Production82_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}