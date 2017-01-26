package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_367 {
    private final Production82_367 production = new Production82_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}