package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_164 {
    private final Production82_164 production = new Production82_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}