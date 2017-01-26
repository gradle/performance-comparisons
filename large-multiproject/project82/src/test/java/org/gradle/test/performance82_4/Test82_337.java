package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_337 {
    private final Production82_337 production = new Production82_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}