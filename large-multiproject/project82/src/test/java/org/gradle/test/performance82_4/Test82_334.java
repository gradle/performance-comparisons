package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_334 {
    private final Production82_334 production = new Production82_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}