package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_423 {
    private final Production82_423 production = new Production82_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}