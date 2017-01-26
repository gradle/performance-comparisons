package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_12 {
    private final Production82_12 production = new Production82_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}