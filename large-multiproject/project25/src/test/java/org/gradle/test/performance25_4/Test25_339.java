package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_339 {
    private final Production25_339 production = new Production25_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}