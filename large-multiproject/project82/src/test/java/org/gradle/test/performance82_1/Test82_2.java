package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_2 {
    private final Production82_2 production = new Production82_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}