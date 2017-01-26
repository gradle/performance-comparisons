package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_345 {
    private final Production75_345 production = new Production75_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}