package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_325 {
    private final Production82_325 production = new Production82_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}