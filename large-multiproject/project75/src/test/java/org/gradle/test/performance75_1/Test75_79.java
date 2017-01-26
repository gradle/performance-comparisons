package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_79 {
    private final Production75_79 production = new Production75_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}