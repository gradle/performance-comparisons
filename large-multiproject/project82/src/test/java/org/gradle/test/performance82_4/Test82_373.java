package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_373 {
    private final Production82_373 production = new Production82_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}