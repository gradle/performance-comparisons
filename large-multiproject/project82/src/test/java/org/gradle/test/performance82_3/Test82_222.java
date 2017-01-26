package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_222 {
    private final Production82_222 production = new Production82_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}