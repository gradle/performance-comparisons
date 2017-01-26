package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_480 {
    private final Production75_480 production = new Production75_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}