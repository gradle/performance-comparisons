package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_24 {
    private final Production75_24 production = new Production75_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}