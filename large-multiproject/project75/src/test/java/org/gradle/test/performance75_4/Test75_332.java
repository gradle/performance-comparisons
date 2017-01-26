package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_332 {
    private final Production75_332 production = new Production75_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}