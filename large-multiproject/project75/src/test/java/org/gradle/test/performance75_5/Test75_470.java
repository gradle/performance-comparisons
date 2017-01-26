package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_470 {
    private final Production75_470 production = new Production75_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}