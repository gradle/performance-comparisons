package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_280 {
    private final Production84_280 production = new Production84_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}