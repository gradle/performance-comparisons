package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_176 {
    private final Production75_176 production = new Production75_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}