package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_201 {
    private final Production75_201 production = new Production75_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}