package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_236 {
    private final Production25_236 production = new Production25_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}