package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_224 {
    private final Production93_224 production = new Production93_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}