package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_50 {
    private final Production84_50 production = new Production84_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}