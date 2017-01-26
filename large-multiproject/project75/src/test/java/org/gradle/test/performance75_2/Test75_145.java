package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_145 {
    private final Production75_145 production = new Production75_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}