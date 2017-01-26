package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_237 {
    private final Production82_237 production = new Production82_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}