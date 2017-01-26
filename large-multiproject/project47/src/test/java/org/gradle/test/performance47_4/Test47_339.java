package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_339 {
    private final Production47_339 production = new Production47_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}