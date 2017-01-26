package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_327 {
    private final Production86_327 production = new Production86_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}