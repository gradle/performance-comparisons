package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_432 {
    private final Production82_432 production = new Production82_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}