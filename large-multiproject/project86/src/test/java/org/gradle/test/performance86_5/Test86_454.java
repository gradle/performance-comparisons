package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_454 {
    private final Production86_454 production = new Production86_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}