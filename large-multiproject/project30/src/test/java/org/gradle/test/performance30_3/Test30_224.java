package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_224 {
    private final Production30_224 production = new Production30_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}