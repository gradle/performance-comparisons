package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_53 {
    private final Production82_53 production = new Production82_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}