package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_224 {
    private final Production4_224 production = new Production4_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}