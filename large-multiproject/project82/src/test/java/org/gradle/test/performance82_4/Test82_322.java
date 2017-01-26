package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_322 {
    private final Production82_322 production = new Production82_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}