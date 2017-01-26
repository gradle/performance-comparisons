package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_236 {
    private final Production82_236 production = new Production82_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}