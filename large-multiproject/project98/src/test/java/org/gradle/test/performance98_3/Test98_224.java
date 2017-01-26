package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_224 {
    private final Production98_224 production = new Production98_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}