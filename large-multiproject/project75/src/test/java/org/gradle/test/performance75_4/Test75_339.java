package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_339 {
    private final Production75_339 production = new Production75_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}