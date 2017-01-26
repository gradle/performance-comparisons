package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_454 {
    private final Production22_454 production = new Production22_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}