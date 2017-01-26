package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_500 {
    private final Production82_500 production = new Production82_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}