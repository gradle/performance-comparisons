package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_441 {
    private final Production75_441 production = new Production75_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}