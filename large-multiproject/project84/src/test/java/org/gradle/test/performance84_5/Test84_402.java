package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_402 {
    private final Production84_402 production = new Production84_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}