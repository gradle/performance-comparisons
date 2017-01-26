package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_172 {
    private final Production82_172 production = new Production82_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}