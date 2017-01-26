package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_415 {
    private final Production82_415 production = new Production82_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}