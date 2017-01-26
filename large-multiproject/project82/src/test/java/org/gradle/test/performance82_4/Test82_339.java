package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_339 {
    private final Production82_339 production = new Production82_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}