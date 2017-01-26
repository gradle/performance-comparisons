package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_246 {
    private final Production82_246 production = new Production82_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}