package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_493 {
    private final Production25_493 production = new Production25_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}