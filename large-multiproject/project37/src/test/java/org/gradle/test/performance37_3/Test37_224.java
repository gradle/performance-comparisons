package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_224 {
    private final Production37_224 production = new Production37_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}