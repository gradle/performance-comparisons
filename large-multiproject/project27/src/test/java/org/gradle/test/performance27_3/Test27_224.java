package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_224 {
    private final Production27_224 production = new Production27_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}