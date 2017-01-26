package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_224 {
    private final Production26_224 production = new Production26_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}