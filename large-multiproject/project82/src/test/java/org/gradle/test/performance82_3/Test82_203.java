package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_203 {
    private final Production82_203 production = new Production82_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}