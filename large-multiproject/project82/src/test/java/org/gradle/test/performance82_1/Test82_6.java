package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_6 {
    private final Production82_6 production = new Production82_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}