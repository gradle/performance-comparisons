package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_224 {
    private final Production61_224 production = new Production61_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}