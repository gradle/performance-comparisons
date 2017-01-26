package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_224 {
    private final Production50_224 production = new Production50_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}