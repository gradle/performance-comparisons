package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_10 {
    private final Production82_10 production = new Production82_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}