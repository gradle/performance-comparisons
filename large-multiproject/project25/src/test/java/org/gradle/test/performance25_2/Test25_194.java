package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_194 {
    private final Production25_194 production = new Production25_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}