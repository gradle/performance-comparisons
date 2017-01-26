package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_180 {
    private final Production75_180 production = new Production75_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}