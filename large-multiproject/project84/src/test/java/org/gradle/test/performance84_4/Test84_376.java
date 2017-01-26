package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_376 {
    private final Production84_376 production = new Production84_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}