package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_323 {
    private final Production82_323 production = new Production82_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}