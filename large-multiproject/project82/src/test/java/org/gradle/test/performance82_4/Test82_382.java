package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_382 {
    private final Production82_382 production = new Production82_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}