package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_215 {
    private final Production82_215 production = new Production82_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}