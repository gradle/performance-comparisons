package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_289 {
    private final Production82_289 production = new Production82_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}