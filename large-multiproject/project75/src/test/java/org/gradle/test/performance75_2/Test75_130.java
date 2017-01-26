package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_130 {
    private final Production75_130 production = new Production75_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}