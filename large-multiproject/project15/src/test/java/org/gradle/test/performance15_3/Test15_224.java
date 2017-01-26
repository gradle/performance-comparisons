package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_224 {
    private final Production15_224 production = new Production15_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}