package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_262 {
    private final Production25_262 production = new Production25_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}