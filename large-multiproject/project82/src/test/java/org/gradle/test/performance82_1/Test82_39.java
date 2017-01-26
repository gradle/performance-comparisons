package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_39 {
    private final Production82_39 production = new Production82_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}