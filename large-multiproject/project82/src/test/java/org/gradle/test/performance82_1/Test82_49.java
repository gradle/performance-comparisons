package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_49 {
    private final Production82_49 production = new Production82_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}