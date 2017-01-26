package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_349 {
    private final Production75_349 production = new Production75_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}