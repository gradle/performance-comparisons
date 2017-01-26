package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_185 {
    private final Production75_185 production = new Production75_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}