package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_161 {
    private final Production82_161 production = new Production82_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}