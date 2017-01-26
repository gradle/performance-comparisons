package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_224 {
    private final Production39_224 production = new Production39_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}