package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_358 {
    private final Production82_358 production = new Production82_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}