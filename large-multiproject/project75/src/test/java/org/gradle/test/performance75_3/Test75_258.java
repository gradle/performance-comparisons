package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_258 {
    private final Production75_258 production = new Production75_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}