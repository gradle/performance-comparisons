package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_454 {
    private final Production18_454 production = new Production18_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}