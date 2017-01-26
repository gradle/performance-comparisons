package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_224 {
    private final Production8_224 production = new Production8_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}