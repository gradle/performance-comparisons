package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_418 {
    private final Production82_418 production = new Production82_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}