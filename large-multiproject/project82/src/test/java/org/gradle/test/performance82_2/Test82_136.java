package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_136 {
    private final Production82_136 production = new Production82_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}