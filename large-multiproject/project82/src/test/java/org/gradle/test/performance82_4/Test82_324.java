package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_324 {
    private final Production82_324 production = new Production82_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}