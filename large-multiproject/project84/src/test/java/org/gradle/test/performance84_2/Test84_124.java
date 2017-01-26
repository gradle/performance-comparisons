package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_124 {
    private final Production84_124 production = new Production84_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}