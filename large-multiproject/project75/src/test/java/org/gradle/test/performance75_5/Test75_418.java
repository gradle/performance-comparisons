package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_418 {
    private final Production75_418 production = new Production75_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}