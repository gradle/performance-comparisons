package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_11 {
    private final Production75_11 production = new Production75_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}