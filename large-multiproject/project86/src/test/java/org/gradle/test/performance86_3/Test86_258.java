package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_258 {
    private final Production86_258 production = new Production86_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}