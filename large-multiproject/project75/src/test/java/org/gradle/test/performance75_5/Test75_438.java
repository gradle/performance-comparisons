package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_438 {
    private final Production75_438 production = new Production75_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}