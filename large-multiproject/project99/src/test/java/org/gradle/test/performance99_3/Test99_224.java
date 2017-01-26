package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_224 {
    private final Production99_224 production = new Production99_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}