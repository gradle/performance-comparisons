package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_365 {
    private final Production82_365 production = new Production82_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}