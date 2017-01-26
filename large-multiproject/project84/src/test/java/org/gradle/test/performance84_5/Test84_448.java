package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_448 {
    private final Production84_448 production = new Production84_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}