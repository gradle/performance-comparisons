package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_356 {
    private final Production82_356 production = new Production82_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}