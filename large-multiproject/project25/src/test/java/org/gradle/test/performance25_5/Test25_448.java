package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_448 {
    private final Production25_448 production = new Production25_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}