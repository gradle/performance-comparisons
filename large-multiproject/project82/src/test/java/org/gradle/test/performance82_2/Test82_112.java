package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_112 {
    private final Production82_112 production = new Production82_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}