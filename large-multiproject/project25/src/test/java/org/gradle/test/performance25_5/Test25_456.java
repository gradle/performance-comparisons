package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_456 {
    private final Production25_456 production = new Production25_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}