package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_268 {
    private final Production82_268 production = new Production82_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}