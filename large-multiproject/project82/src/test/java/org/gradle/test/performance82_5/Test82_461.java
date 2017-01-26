package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_461 {
    private final Production82_461 production = new Production82_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}