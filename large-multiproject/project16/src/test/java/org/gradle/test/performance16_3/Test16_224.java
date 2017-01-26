package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_224 {
    private final Production16_224 production = new Production16_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}