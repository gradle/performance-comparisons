package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_270 {
    private final Production82_270 production = new Production82_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}