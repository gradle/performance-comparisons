package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_443 {
    private final Production75_443 production = new Production75_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}