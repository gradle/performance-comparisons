package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_306 {
    private final Production75_306 production = new Production75_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}