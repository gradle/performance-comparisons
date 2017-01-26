package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_224 {
    private final Production92_224 production = new Production92_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}