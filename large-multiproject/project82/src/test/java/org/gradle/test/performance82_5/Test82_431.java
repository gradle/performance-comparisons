package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_431 {
    private final Production82_431 production = new Production82_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}