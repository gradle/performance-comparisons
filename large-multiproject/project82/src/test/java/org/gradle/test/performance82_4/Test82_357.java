package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_357 {
    private final Production82_357 production = new Production82_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}