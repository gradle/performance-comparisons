package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_201 {
    private final Production84_201 production = new Production84_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}