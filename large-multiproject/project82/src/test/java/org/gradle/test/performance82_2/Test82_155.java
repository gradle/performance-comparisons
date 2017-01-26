package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_155 {
    private final Production82_155 production = new Production82_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}