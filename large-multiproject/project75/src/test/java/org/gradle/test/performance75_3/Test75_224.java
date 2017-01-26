package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_224 {
    private final Production75_224 production = new Production75_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}