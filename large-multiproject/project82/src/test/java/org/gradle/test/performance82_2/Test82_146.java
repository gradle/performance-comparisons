package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_146 {
    private final Production82_146 production = new Production82_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}