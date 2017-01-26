package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_133 {
    private final Production75_133 production = new Production75_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}