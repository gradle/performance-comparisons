package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_90 {
    private final Production82_90 production = new Production82_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}