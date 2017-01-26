package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_176 {
    private final Production82_176 production = new Production82_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}