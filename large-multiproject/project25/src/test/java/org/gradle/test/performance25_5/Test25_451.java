package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_451 {
    private final Production25_451 production = new Production25_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}