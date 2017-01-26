package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_308 {
    private final Production82_308 production = new Production82_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}