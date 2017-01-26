package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_362 {
    private final Production82_362 production = new Production82_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}