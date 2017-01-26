package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_273 {
    private final Production86_273 production = new Production86_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}