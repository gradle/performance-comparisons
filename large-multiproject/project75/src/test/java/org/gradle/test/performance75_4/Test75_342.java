package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_342 {
    private final Production75_342 production = new Production75_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}