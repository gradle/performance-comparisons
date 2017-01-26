package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_243 {
    private final Production82_243 production = new Production82_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}