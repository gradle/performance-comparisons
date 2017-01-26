package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_284 {
    private final Production75_284 production = new Production75_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}