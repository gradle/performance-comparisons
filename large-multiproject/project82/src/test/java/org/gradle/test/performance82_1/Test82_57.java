package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_57 {
    private final Production82_57 production = new Production82_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}