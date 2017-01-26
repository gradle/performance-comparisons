package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_224 {
    private final Production95_224 production = new Production95_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}