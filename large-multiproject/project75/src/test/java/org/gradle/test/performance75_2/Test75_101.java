package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_101 {
    private final Production75_101 production = new Production75_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}