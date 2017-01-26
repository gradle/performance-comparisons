package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_487 {
    private final Production84_487 production = new Production84_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}