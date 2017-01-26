package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_197 {
    private final Production82_197 production = new Production82_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}