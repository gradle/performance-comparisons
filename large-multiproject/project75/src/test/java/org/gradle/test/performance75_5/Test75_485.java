package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_485 {
    private final Production75_485 production = new Production75_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}