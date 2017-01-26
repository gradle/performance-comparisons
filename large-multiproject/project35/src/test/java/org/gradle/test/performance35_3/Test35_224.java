package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_224 {
    private final Production35_224 production = new Production35_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}