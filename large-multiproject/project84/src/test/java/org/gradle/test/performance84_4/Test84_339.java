package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_339 {
    private final Production84_339 production = new Production84_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}