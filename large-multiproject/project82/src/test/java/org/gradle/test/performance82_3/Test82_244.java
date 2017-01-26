package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_244 {
    private final Production82_244 production = new Production82_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}