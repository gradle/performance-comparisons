package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_95 {
    private final Production82_95 production = new Production82_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}