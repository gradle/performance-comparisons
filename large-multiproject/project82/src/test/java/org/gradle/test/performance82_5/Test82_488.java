package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_488 {
    private final Production82_488 production = new Production82_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}