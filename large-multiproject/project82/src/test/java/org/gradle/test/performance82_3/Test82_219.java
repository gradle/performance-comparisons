package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_219 {
    private final Production82_219 production = new Production82_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}