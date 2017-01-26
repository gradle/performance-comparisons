package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_15 {
    private final Production75_15 production = new Production75_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}