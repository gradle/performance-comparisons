package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_422 {
    private final Production82_422 production = new Production82_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}