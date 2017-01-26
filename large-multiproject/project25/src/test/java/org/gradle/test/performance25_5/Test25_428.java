package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_428 {
    private final Production25_428 production = new Production25_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}