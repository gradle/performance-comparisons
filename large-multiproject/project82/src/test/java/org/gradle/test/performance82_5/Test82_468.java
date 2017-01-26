package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_468 {
    private final Production82_468 production = new Production82_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}