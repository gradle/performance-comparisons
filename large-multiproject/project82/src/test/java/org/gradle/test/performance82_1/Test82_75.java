package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_75 {
    private final Production82_75 production = new Production82_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}