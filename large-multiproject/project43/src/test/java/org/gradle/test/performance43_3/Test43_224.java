package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_224 {
    private final Production43_224 production = new Production43_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}