package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_395 {
    private final Production82_395 production = new Production82_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}