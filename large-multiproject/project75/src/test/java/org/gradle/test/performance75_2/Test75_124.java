package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_124 {
    private final Production75_124 production = new Production75_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}