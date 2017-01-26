package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_242 {
    private final Production75_242 production = new Production75_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}