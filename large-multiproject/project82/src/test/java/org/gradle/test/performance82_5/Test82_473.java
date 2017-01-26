package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_473 {
    private final Production82_473 production = new Production82_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}