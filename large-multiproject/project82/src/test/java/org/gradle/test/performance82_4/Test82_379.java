package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_379 {
    private final Production82_379 production = new Production82_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}