package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_20 {
    private final Production75_20 production = new Production75_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}