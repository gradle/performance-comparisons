package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_368 {
    private final Production84_368 production = new Production84_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}