package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_286 {
    private final Production82_286 production = new Production82_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}