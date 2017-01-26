package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_419 {
    private final Production82_419 production = new Production82_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}