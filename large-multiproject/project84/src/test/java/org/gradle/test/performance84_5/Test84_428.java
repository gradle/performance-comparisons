package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_428 {
    private final Production84_428 production = new Production84_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}