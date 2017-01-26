package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_429 {
    private final Production25_429 production = new Production25_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}