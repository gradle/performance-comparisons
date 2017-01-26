package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_224 {
    private final Production77_224 production = new Production77_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}