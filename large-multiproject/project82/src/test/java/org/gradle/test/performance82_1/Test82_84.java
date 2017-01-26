package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_84 {
    private final Production82_84 production = new Production82_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}