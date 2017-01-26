package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_224 {
    private final Production86_224 production = new Production86_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}