package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_224 {
    private final Production5_224 production = new Production5_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}