package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_158 {
    private final Production82_158 production = new Production82_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}