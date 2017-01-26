package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_404 {
    private final Production82_404 production = new Production82_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}