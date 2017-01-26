package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_240 {
    private final Production75_240 production = new Production75_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}