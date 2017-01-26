package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_392 {
    private final Production82_392 production = new Production82_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}