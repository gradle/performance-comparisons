package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_368 {
    private final Production25_368 production = new Production25_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}