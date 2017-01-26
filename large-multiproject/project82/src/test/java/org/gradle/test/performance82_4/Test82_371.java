package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_371 {
    private final Production82_371 production = new Production82_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}