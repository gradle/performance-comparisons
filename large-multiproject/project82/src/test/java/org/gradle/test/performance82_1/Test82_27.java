package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_27 {
    private final Production82_27 production = new Production82_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}