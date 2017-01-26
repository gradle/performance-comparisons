package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_481 {
    private final Production82_481 production = new Production82_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}