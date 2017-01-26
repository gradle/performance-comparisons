package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_200 {
    private final Production82_200 production = new Production82_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}