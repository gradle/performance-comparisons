package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_447 {
    private final Production75_447 production = new Production75_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}