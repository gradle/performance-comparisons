package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_52 {
    private final Production82_52 production = new Production82_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}