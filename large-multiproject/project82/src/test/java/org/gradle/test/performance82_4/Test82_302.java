package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_302 {
    private final Production82_302 production = new Production82_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}