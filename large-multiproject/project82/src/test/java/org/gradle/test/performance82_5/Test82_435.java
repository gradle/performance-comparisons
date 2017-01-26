package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_435 {
    private final Production82_435 production = new Production82_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}