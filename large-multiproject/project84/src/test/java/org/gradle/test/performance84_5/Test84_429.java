package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_429 {
    private final Production84_429 production = new Production84_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}