package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_313 {
    private final Production82_313 production = new Production82_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}