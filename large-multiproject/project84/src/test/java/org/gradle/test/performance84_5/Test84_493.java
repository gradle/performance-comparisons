package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_493 {
    private final Production84_493 production = new Production84_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}