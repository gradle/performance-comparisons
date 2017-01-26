package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_309 {
    private final Production82_309 production = new Production82_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}