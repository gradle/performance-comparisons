package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_224 {
    private final Production31_224 production = new Production31_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}