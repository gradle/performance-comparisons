package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_32 {
    private final Production75_32 production = new Production75_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}