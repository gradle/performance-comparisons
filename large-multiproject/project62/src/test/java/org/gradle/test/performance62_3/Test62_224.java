package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_224 {
    private final Production62_224 production = new Production62_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}