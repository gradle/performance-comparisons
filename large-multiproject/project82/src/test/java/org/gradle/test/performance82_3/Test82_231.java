package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_231 {
    private final Production82_231 production = new Production82_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}