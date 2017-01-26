package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_113 {
    private final Production75_113 production = new Production75_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}