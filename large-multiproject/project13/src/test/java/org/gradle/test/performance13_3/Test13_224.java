package org.gradle.test.performance13_3;

import static org.junit.Assert.*;

public class Test13_224 {
    private final Production13_224 production = new Production13_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}