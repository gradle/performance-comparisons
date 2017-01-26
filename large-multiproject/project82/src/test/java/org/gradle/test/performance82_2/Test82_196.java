package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_196 {
    private final Production82_196 production = new Production82_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}