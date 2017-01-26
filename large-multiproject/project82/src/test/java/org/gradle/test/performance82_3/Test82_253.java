package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_253 {
    private final Production82_253 production = new Production82_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}