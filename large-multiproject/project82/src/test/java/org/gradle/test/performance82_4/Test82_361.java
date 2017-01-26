package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_361 {
    private final Production82_361 production = new Production82_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}