package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_380 {
    private final Production82_380 production = new Production82_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}