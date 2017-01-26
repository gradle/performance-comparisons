package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_210 {
    private final Production82_210 production = new Production82_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}