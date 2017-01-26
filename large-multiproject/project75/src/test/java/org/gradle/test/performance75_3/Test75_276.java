package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_276 {
    private final Production75_276 production = new Production75_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}