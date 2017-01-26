package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_214 {
    private final Production82_214 production = new Production82_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}