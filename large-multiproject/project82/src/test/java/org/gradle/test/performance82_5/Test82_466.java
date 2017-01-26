package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_466 {
    private final Production82_466 production = new Production82_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}