package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_239 {
    private final Production82_239 production = new Production82_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}