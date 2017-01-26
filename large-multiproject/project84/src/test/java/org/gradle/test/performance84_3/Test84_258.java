package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_258 {
    private final Production84_258 production = new Production84_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}