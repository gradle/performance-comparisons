package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_245 {
    private final Production25_245 production = new Production25_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}