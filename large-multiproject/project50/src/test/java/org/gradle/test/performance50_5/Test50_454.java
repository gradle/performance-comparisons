package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_454 {
    private final Production50_454 production = new Production50_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}