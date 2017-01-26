package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_295 {
    private final Production75_295 production = new Production75_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}