package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_473 {
    private final Production25_473 production = new Production25_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}