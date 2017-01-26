package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_224 {
    private final Production84_224 production = new Production84_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}