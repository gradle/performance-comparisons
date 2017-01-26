package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_15 {
    private final Production82_15 production = new Production82_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}