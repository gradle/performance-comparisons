package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_31 {
    private final Production82_31 production = new Production82_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}