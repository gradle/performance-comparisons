package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_245 {
    private final Production86_245 production = new Production86_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}