package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_384 {
    private final Production75_384 production = new Production75_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}