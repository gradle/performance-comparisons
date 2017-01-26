package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_110 {
    private final Production84_110 production = new Production84_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}