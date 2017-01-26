package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_208 {
    private final Production82_208 production = new Production82_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}