package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_117 {
    private final Production25_117 production = new Production25_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}