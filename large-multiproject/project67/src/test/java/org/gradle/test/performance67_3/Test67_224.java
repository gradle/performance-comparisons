package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_224 {
    private final Production67_224 production = new Production67_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}