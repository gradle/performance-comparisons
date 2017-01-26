package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_305 {
    private final Production82_305 production = new Production82_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}