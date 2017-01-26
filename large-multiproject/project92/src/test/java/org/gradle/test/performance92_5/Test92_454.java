package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_454 {
    private final Production92_454 production = new Production92_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}