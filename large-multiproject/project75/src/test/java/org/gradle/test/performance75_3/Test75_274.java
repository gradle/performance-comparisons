package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_274 {
    private final Production75_274 production = new Production75_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}