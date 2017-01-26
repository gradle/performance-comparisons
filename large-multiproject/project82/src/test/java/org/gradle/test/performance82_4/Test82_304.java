package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_304 {
    private final Production82_304 production = new Production82_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}