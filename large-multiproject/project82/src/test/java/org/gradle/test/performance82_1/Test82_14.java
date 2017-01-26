package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_14 {
    private final Production82_14 production = new Production82_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}