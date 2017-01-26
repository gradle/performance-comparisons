package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_36 {
    private final Production82_36 production = new Production82_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}