package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_202 {
    private final Production82_202 production = new Production82_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}