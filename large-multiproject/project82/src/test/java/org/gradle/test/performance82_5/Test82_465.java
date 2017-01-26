package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_465 {
    private final Production82_465 production = new Production82_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}