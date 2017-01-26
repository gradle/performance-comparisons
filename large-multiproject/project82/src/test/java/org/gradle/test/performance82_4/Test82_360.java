package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_360 {
    private final Production82_360 production = new Production82_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}