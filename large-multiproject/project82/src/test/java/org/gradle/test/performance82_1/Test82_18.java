package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_18 {
    private final Production82_18 production = new Production82_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}