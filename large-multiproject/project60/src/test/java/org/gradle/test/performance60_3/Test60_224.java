package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_224 {
    private final Production60_224 production = new Production60_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}