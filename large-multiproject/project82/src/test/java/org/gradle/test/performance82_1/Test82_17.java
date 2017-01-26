package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_17 {
    private final Production82_17 production = new Production82_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}