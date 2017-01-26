package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_238 {
    private final Production82_238 production = new Production82_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}