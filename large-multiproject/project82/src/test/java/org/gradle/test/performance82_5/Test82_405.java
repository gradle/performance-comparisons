package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_405 {
    private final Production82_405 production = new Production82_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}