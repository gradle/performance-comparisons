package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_271 {
    private final Production75_271 production = new Production75_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}