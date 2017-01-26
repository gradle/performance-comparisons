package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_256 {
    private final Production75_256 production = new Production75_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}