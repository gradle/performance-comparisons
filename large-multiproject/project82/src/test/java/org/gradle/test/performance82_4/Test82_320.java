package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_320 {
    private final Production82_320 production = new Production82_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}