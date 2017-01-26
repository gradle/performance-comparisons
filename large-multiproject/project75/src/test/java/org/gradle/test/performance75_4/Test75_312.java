package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_312 {
    private final Production75_312 production = new Production75_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}