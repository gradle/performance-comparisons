package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_224 {
    private final Production89_224 production = new Production89_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}