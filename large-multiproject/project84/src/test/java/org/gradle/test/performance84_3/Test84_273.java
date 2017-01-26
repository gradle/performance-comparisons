package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_273 {
    private final Production84_273 production = new Production84_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}