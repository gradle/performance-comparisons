package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_490 {
    private final Production84_490 production = new Production84_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}