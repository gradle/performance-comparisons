package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_224 {
    private final Production10_224 production = new Production10_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}