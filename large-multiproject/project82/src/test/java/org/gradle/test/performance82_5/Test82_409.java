package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_409 {
    private final Production82_409 production = new Production82_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}