package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_284 {
    private final Production84_284 production = new Production84_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}