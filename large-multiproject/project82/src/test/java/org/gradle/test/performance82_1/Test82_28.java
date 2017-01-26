package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_28 {
    private final Production82_28 production = new Production82_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}