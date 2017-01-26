package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_428 {
    private final Production75_428 production = new Production75_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}