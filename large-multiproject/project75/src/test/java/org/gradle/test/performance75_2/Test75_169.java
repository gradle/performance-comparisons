package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_169 {
    private final Production75_169 production = new Production75_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}