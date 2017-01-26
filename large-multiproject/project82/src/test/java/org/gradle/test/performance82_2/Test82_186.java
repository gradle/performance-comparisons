package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_186 {
    private final Production82_186 production = new Production82_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}