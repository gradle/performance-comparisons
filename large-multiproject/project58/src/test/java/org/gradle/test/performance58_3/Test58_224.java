package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_224 {
    private final Production58_224 production = new Production58_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}